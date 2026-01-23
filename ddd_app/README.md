# DDD App - Aplicación Spring Boot con Arquitectura DDD

## 📋 Descripción General

Este proyecto es una aplicación Java basada en **Spring Boot 3.2.2** que implementa los principios de **Domain-Driven Design (DDD)** mediante una arquitectura modular de múltiples capas. La aplicación está estructurada como un proyecto Maven multi-módulo que separa claramente las responsabilidades del dominio, la lógica de aplicación y la infraestructura técnica.

## 🏗️ Arquitectura del Proyecto

### Estructura de Módulos

El proyecto sigue una arquitectura en capas basada en DDD, organizada en tres módulos principales:

```
ddd-app/
├── domain/          # Capa de Dominio (Núcleo del negocio)
├── application/     # Capa de Aplicación (Casos de uso)
└── infrastructure/  # Capa de Infraestructura (Spring Boot, APIs, Persistencia)
```

### Diagrama de Dependencias

```
┌─────────────────┐
│  Infrastructure │  ← Capa más externa (depende de todo)
└────────┬────────┘
         │
         ├───► ┌──────────────┐
         │     │  Application │  ← Capa intermedia
         │     └──────┬───────┘
         │            │
         └────────────┼───► ┌──────────┐
                      │     │  Domain  │  ← Capa más interna (independiente)
                      └─────┴──────────┘
```

**Regla de dependencias:** Las capas externas pueden depender de las internas, pero nunca al revés. Esto garantiza que el dominio permanezca independiente de frameworks y tecnologías específicas.

---

## 📦 Módulos Detallados

### 1. **Domain** (`domain/`)

**Propósito:** Contiene la lógica de negocio pura y las reglas del dominio.

**Características:**
- ✅ **Sin dependencias externas** - No depende de frameworks ni librerías de infraestructura
- ✅ **Entidades de dominio** - Representan los conceptos principales del negocio
- ✅ **Value Objects** - Objetos inmutables que representan conceptos del dominio
- ✅ **Reglas de negocio** - Lógica que define cómo funciona el dominio
- ✅ **Interfaces de repositorio** - Define contratos sin implementación

**Estructura típica:**
```
domain/
└── src/main/java/com/bkseducate/domain/
    ├── entities/          # Entidades del dominio
    ├── valueobjects/      # Objetos de valor
    ├── repositories/      # Interfaces de repositorio
    └── services/         # Servicios de dominio
```

**Ejemplo de uso:** Si estás modelando un sistema de e-commerce, aquí irían las clases `Product`, `Order`, `Customer` con sus reglas de negocio (ej: "un pedido debe tener al menos un producto").

---

### 2. **Application** (`application/`)

**Propósito:** Contiene los casos de uso de la aplicación y orquesta las operaciones del dominio.

**Características:**
- ✅ **Depende solo de Domain** - Conoce el dominio pero no la infraestructura
- ✅ **Casos de uso** - Cada caso de uso representa una acción del usuario
- ✅ **DTOs (Data Transfer Objects)** - Objetos para transferir datos entre capas
- ✅ **Servicios de aplicación** - Coordinan las operaciones del dominio
- ✅ **Comandos y Consultas** - Patrón CQRS (opcional)

**Estructura típica:**
```
application/
└── src/main/java/com/bkseducate/application/
    ├── usecases/          # Casos de uso
    ├── services/          # Servicios de aplicación
    ├── dtos/              # Objetos de transferencia de datos
    └── mappers/           # Mapeadores entre DTOs y entidades
```

**Ejemplo de uso:** Un caso de uso `CreateOrderUseCase` que coordina la creación de un pedido: valida datos, crea la entidad `Order` en el dominio, y persiste mediante el repositorio.

---

### 3. **Infrastructure** (`infrastructure/`)

**Propósito:** Proporciona las implementaciones técnicas y la configuración del framework.

**Características:**
- ✅ **Depende de Application y Domain** - Implementa las interfaces definidas en capas internas
- ✅ **Spring Boot** - Framework de aplicación
- ✅ **Controladores REST** - Endpoints HTTP (si aplica)
- ✅ **Implementaciones de repositorio** - Acceso a base de datos, APIs externas, etc.
- ✅ **Configuración** - Beans de Spring, propiedades, etc.
- ✅ **Punto de entrada** - Clase principal `MiappApplication`

**Estructura típica:**
```
infrastructure/
└── src/main/java/com/bkseducate/infrastructure/
    ├── MiappApplication.java    # Clase principal Spring Boot
    ├── controllers/              # Controladores REST
    ├── persistence/              # Implementaciones de repositorio
    ├── config/                   # Configuración de Spring
    └── adapters/                 # Adaptadores externos
```

**Ejemplo de uso:** Un `OrderController` que expone endpoints REST, y un `JpaOrderRepository` que implementa la interfaz `OrderRepository` del dominio usando JPA/Hibernate.

---

## 🔧 Configuración Técnica

### Tecnologías Utilizadas

- **Java 17** - Lenguaje de programación
- **Maven** - Gestor de dependencias y construcción
- **Spring Boot 3.2.2** - Framework de aplicación
- **Spring Web** - Para APIs REST (incluido en `spring-boot-starter-web`)

### Estructura del POM Principal

El `pom.xml` raíz actúa como un **POM padre** que:

1. **Define módulos:** Declara los tres módulos (`domain`, `application`, `infrastructure`)
2. **Gestiona dependencias:** Usa `dependencyManagement` para centralizar versiones
3. **Configura propiedades:** Java 17, encoding UTF-8, versión de Spring Boot
4. **Plugin Management:** Configura plugins compartidos (Spring Boot Maven Plugin, Maven Wrapper)

### Configuración de Módulos

Cada módulo tiene su propio `pom.xml` que:

- **Hereda del POM padre** mediante `<parent>`
- **Define sus dependencias específicas:**
  - `domain`: Sin dependencias (puro Java)
  - `application`: Depende de `domain`
  - `infrastructure`: Depende de `application` y `domain`, además de Spring Boot

---

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos

- **Java 17** o superior
- **Maven 3.6+** (o usar el Maven Wrapper incluido)
- **IDE** con soporte para Java (IntelliJ IDEA, Eclipse, VS Code)

### Pasos para Ejecutar

1. **Clonar o navegar al proyecto:**
   ```bash
   cd d:\springprojects\ddd-app
   ```

2. **Compilar el proyecto:**
   ```bash
   mvn clean install
   ```
   O usando el wrapper:
   ```bash
   ./mvnw clean install
   ```

3. **Ejecutar la aplicación:**
   ```bash
   cd infrastructure
   mvn spring-boot:run
   ```
   
   O ejecutar directamente la clase principal:
   ```bash
   java -jar infrastructure/target/infrastructure-1.0-SNAPSHOT.jar
   ```

### Ejecución desde VS Code

El proyecto incluye configuración de VS Code en `.vscode/launch.json`:

- **Configuración disponible:** "Spring Boot-MiappApplication<infrastructure>"
- **Clase principal:** `com.bkseducate.infrastructure.MiappApplication`
- **Variables de entorno:** Se cargan desde `.env` (si existe)

Simplemente presiona `F5` o usa el panel de "Run and Debug" en VS Code.

---

## 📁 Estructura de Directorios Completa

```
ddd-app/
│
├── .vscode/                          # Configuración de VS Code
│   ├── launch.json                   # Configuración de depuración
│   └── settings.json                 # Configuración del editor
│
├── application/                      # Módulo de Aplicación
│   ├── pom.xml                       # Configuración Maven del módulo
│   └── src/main/java/                # Código fuente (estructura por crear)
│
├── domain/                           # Módulo de Dominio
│   ├── pom.xml                       # Configuración Maven del módulo
│   └── src/main/java/                # Código fuente (estructura por crear)
│
├── infrastructure/                   # Módulo de Infraestructura
│   ├── pom.xml                       # Configuración Maven del módulo
│   └── src/main/java/
│       └── com/bkseducate/infrastructure/
│           └── MiappApplication.java # Clase principal Spring Boot
│
├── src/                              # Código fuente raíz (legacy)
│   └── main/java/com/bkseducate/
│       └── Main.java                 # Clase Main simple (no usada en Spring Boot)
│
├── pom.xml                           # POM padre (raíz)
└── README.md                         # Este archivo
```

---

## 🎯 Principios de Diseño Aplicados

### 1. **Separación de Responsabilidades**
Cada módulo tiene una responsabilidad única y bien definida:
- **Domain:** Lógica de negocio
- **Application:** Casos de uso y orquestación
- **Infrastructure:** Detalles técnicos y frameworks

### 2. **Inversión de Dependencias**
Las capas internas definen interfaces (abstracciones), y las capas externas las implementan:
- El dominio define `OrderRepository` (interfaz)
- La infraestructura implementa `JpaOrderRepository` (implementación)

### 3. **Independencia del Framework**
El dominio no conoce Spring Boot ni ninguna tecnología específica, lo que permite:
- Cambiar de framework sin afectar el dominio
- Probar el dominio de forma aislada
- Reutilizar el dominio en diferentes contextos

### 4. **Testabilidad**
La arquitectura facilita las pruebas:
- **Domain:** Pruebas unitarias puras (sin mocks de frameworks)
- **Application:** Pruebas de casos de uso con mocks de repositorios
- **Infrastructure:** Pruebas de integración con Spring Boot Test

---

## 📝 Convenciones de Código

### Paquetes

- **Dominio:** `com.bkseducate.domain.*`
- **Aplicación:** `com.bkseducate.application.*`
- **Infraestructura:** `com.bkseducate.infrastructure.*`

### Nomenclatura

- **Entidades:** Sustantivos en singular (`Order`, `Product`)
- **Repositorios:** `[Entity]Repository` (`OrderRepository`)
- **Casos de uso:** `[Action][Entity]UseCase` (`CreateOrderUseCase`)
- **Controladores:** `[Entity]Controller` (`OrderController`)

---

## 🔄 Flujo de Datos Típico

```
Cliente HTTP
    ↓
Infrastructure (Controller)
    ↓ recibe DTO
Application (UseCase)
    ↓ usa entidades del dominio
Domain (Entity/Service)
    ↓ persiste mediante interfaz
Infrastructure (Repository Implementation)
    ↓
Base de Datos / Servicio Externo
```

**Ejemplo concreto:**
1. Cliente hace `POST /api/orders` con JSON
2. `OrderController` (Infrastructure) recibe el DTO
3. `CreateOrderUseCase` (Application) valida y crea `Order` (Domain)
4. `JpaOrderRepository` (Infrastructure) persiste en BD
5. Se retorna respuesta al cliente

---

## 🧪 Próximos Pasos Recomendados

Para desarrollar la aplicación completa, considera agregar:

1. **En Domain:**
   - Entidades del dominio
   - Value Objects
   - Interfaces de repositorio
   - Servicios de dominio

2. **En Application:**
   - Casos de uso específicos
   - DTOs de entrada/salida
   - Mappers entre DTOs y entidades

3. **En Infrastructure:**
   - Controladores REST
   - Implementaciones de repositorio (JPA, MongoDB, etc.)
   - Configuración de Spring (seguridad, validación, etc.)
   - Manejo de excepciones global

4. **Testing:**
   - Pruebas unitarias del dominio
   - Pruebas de casos de uso
   - Pruebas de integración de controladores

---

## 📚 Recursos Adicionales

- [Domain-Driven Design (Eric Evans)](https://www.domainlanguage.com/ddd/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Maven Multi-Module Projects](https://maven.apache.org/guides/mini/guide-multiple-modules.html)
- [Clean Architecture (Robert C. Martin)](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)

---

## 👥 Contribución

Este proyecto sigue las mejores prácticas de DDD y arquitectura limpia. Al contribuir:

1. Mantén la separación de capas
2. No agregues dependencias al dominio
3. Escribe pruebas para cada capa
4. Documenta casos de uso complejos

---

## 📄 Licencia

Este proyecto es de uso educativo y demostrativo.

---

**Versión:** 1.0-SNAPSHOT  
**Última actualización:** Enero 2026
