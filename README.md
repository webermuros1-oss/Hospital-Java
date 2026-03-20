# Hospital - Sistema de Gestión Hospitalaria en Java - Ejercicio Java 

Proyecto Java que modela un sistema hospitalario mediante programación orientada a objetos, aplicando herencia, interfaces, clases abstractas y polimorfismo.

---

## Tabla de Contenidos

- [Descripción](#descripción)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Jerarquía de Clases](#jerarquía-de-clases)
- [Clases e Interfaces](#clases-e-interfaces)
  - [Interfaces](#interfaces)
  - [Clase Base](#clase-base)
  - [Doctores](#doctores)
  - [Pacientes](#pacientes)
- [Diagrama UML](#diagrama-uml)
- [Tecnologías](#tecnologías)
- [Ejecución](#ejecución)
- [Ejemplo de Salida](#ejemplo-de-salida)

---

## Descripción

Este proyecto simula el funcionamiento básico de un hospital, modelando dos tipos de actores principales:

- **Doctores**: especializados y en formación, con distintas responsabilidades laborales.
- **Pacientes**: de consulta ordinaria y de urgencias (ambulancia), con flujos de atención diferenciados.

Se aplican los siguientes principios de la POO:
- **Herencia** — jerarquía de clases desde `Character` hasta las clases concretas.
- **Abstracción** — clases abstractas que definen estructura común sin implementación completa.
- **Polimorfismo** — cada subclase implementa `showInfo()` y los métodos de las interfaces a su manera.
- **Encapsulamiento** — todos los atributos son privados con acceso mediante getters y setters.
- **Interfaces** — contratos de comportamiento independientes para trabajadores y pacientes.

---

## Estructura del Proyecto

```
Hospital/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── org/example/
                ├── Main.java
                ├── character/
                │   └── Character.java
                ├── interfaces/
                │   ├── Attendable.java
                │   └── Worker.java
                ├── doctors/
                │   ├── Doctor.java
                │   ├── Specialist.java
                │   └── StudentDoctor.java
                └── patients/
                    ├── Patient.java
                    ├── ConsultationPatient.java
                    └── AmbulancePatient.java
```

---

## Jerarquía de Clases

```
Character  (abstracta)
├── Doctor  (abstracta) ──── implements Worker
│   ├── Specialist
│   └── StudentDoctor
└── Patient  (abstracta) ──── implements Attendable
    ├── ConsultationPatient
    └── AmbulancePatient

Interfaces:
├── Worker       → workHours(), eat(), vacation()
└── Attendable   → admission(), treatment(), discharge()
```

---

## Clases e Interfaces

### Interfaces

#### `Worker` — `org.example.interfaces`

Define el contrato de comportamiento laboral para los doctores.

| Método | Descripción |
|--------|-------------|
| `workHours()` | Muestra las horas de trabajo semanales |
| `eat()` | Comportamiento durante el descanso para comer |
| `vacation()` | Gestión de las vacaciones del trabajador |

#### `Attendable` — `org.example.interfaces`

Define el flujo de atención médica para los pacientes.

| Método | Descripción |
|--------|-------------|
| `admission()` | Proceso de admisión del paciente |
| `treatment()` | Aplicación del tratamiento médico |
| `discharge()` | Alta y salida del paciente |

---

### Clase Base

#### `Character` — `org.example.character` (abstracta)

Clase raíz de la que heredan todos los actores del sistema.

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `name` | String | Nombre del personaje |
| `age` | int | Edad |
| `id` | String | Identificador único |

- Método abstracto: `showInfo()` — obliga a cada subclase a mostrar su información propia.

---

### Doctores

#### `Doctor` — `org.example.doctors` (abstracta)

Extiende `Character`, implementa `Worker`.

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `weeklyHours` | int | Horas de trabajo semanales |

Clase intermedia que agrupa atributos comunes a todos los doctores. Los métodos de `Worker` son implementados por las subclases.

---

#### `Specialist` — `org.example.doctors`

Extiende `Doctor`. Representa a un médico especializado en un área concreta.

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `specialty` | String | Especialidad médica (ej. Cardiología, Cirugía) |

| Método | Descripción |
|--------|-------------|
| `workHours()` | Muestra horas semanales de trabajo |
| `eat()` | Comportamiento en el descanso |
| `vacation()` | Gestión de vacaciones |
| `showInfo()` | Muestra nombre, id, edad, horas y especialidad |

---

#### `StudentDoctor` — `org.example.doctors`

Extiende `Doctor`. Representa a un médico en periodo de formación.

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `studyHours` | int | Horas de estudio semanales |
| `currentCourse` | String | Nombre del curso o especialización en curso |

| Método | Descripción |
|--------|-------------|
| `workHours()` | Muestra horas semanales de trabajo |
| `studyHours()` | Muestra horas semanales de estudio |
| `eat()` | Comportamiento en el descanso |
| `vacation()` | Gestión de vacaciones |
| `showInfo()` | Muestra nombre, id, edad, horas, curso y horas de estudio |

---

### Pacientes

#### `Patient` — `org.example.patients` (abstracta)

Extiende `Character`, implementa `Attendable`.

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `illness` | String | Enfermedad o condición médica del paciente |

- Método abstracto: `room()` — cada tipo de paciente se asigna a una sala distinta.

---

#### `ConsultationPatient` — `org.example.patients`

Extiende `Patient`. Modela a un paciente de consulta externa ordinaria.

| Método | Descripción |
|--------|-------------|
| `admission()` | Admisión en consulta |
| `treatment()` | Tratamiento en consulta |
| `discharge()` | Alta médica |
| `nurseCheck()` | Revisión de enfermería previa a la consulta |
| `room()` | Asignación a sala de consulta |
| `nextAppointment()` | Programación de la próxima cita |
| `showInfo()` | Muestra nombre, id, edad y enfermedad |

---

#### `AmbulancePatient` — `org.example.patients`

Extiende `Patient`. Modela a un paciente de urgencias llegado en ambulancia.

| Método | Descripción |
|--------|-------------|
| `admission()` | Admisión urgente por ambulancia |
| `treatment()` | Tratamiento intensivo de urgencias |
| `discharge()` | Alta tras recuperación |
| `operation()` | Intervención quirúrgica de emergencia |
| `room()` | Asignación a sala de urgencias |
| `rehabilitation()` | Programa de rehabilitación post-operatoria |
| `showInfo()` | Muestra nombre, id, edad y enfermedad |

---

## Diagrama UML

```
+------------------+
|   <<interface>>  |         +------------------+
|     Worker       |         |   <<interface>>  |
|------------------|         |    Attendable    |
| + workHours()    |         |------------------|
| + eat()          |         | + admission()    |
| + vacation()     |         | + treatment()    |
+--------^---------+         | + discharge()    |
         |                   +--------^---------+
         |                            |
+--------+---------+        +---------+---------+
|  Character       |        |                   |
|  <<abstract>>    |        |                   |
|------------------|        |                   |
| - name: String   |        |                   |
| - age: int       |        |                   |
| - id: String     |        |                   |
| + showInfo()     |        |                   |
+--------^---------+        |                   |
         |                  |                   |
    +----+----+         +---+-----+             |
    |         |         |         |             |
+---+----+ +--+-----+ +-+------+  |         +---+--------+
| Doctor | | Patient| |        |  |         |            |
|abstract| |abstract| |        |  |         |            |
+---^----+ +--^-----+ |        |  |         |            |
    |          |       |        |  |         |            |
+---+------+ +-+-------------------+    +---+------------------+
|Specialist| |ConsultationPatient |    |  AmbulancePatient    |
+----------+ +--------------------+    +----------------------+
|StudentDoc|
+----------+
```

---

## Tecnologías

| Tecnología | Versión |
|------------|---------|
| Java | 25 |
| Maven | 3.x |
| IntelliJ IDEA | — |

---

## Ejecución

### Requisitos

- JDK 25 instalado
- Maven 3.x instalado

### Compilar y ejecutar con Maven

```bash
# Compilar el proyecto
mvn compile

# Ejecutar la clase principal
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### Ejecutar desde IntelliJ IDEA

1. Abrir el proyecto (`File > Open` → seleccionar la carpeta `Hospital`).
2. Esperar a que Maven descargue las dependencias.
3. Abrir `src/main/java/org/example/Main.java`.
4. Pulsar el botón ▶ junto al método `main`.

---

## Ejemplo de Salida

Al ejecutar `Main.java`, se crean y muestran las siguientes instancias:

**Pacientes de consulta:** Ana, Luis
**Pacientes de urgencias:** Carlos, María
**Especialistas:** Dr. House (Diagnóstico), Dr. Strange (Cirugía)
**Médicos en formación:** John (Cardiología), Laura (Neurología)

```
--- Consulta ---
Nombre: Ana | ID: C001 | Edad: 30 | Enfermedad: Gripe
Nombre: Luis | ID: C002 | Edad: 45 | Enfermedad: Diabetes

--- Urgencias ---
Nombre: Carlos | ID: A001 | Edad: 60 | Enfermedad: Infarto
Nombre: Maria | ID: A002 | Edad: 25 | Enfermedad: Fractura

--- Especialistas ---
Nombre: Dr. House | ID: D001 | Edad: 50 | Horas: 40 | Especialidad: Diagnóstico
Nombre: Dr. Strange | ID: D002 | Edad: 42 | Horas: 45 | Especialidad: Cirugía

--- Médicos en Formación ---
Nombre: John | ID: S001 | Edad: 28 | Curso: Cardiología
Nombre: Laura | ID: S002 | Edad: 26 | Curso: Neurología
```

---

## Autores

Proyecto desarrollado como práctica de Programación Orientada a Objetos en Java por Heber Paris Caamaño.