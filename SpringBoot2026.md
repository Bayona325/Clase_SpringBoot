[TOC]



# 1. Fundamentos SpringBoot

## 1.1 ¿Qué son los frameworks?

Los *frameworks* son “*marcos de trabajo*” o conocidos por ser entornos de trabajo que buscan apoyar el desarrollo de aplicaciones profesionales que sean estables y dinámicas. Estos *Frameworks* vienen con un conjunto de paquetes (librerías), herramientas y diversas utilidades que buscan apoyar el desarrollo de un macro-proyecto.

Un *framework* busca ser parte del paradigma del desarrollo de software ágil , con el fin de desarrollar proyectos de manera productiva y en menos tiempo. En este caso, desarrollar aplicativos web que tengan alta complejidad de consumo a nivel de información y contenido será de gran ayuda al momento de implementar *frameworks* en el proyecto.

Las características principales de un *framework* son las siguientes :

- **📮Escalabilidad** : Un proyecto basado en un *framework* permite crearlo al ritmo y necesidades del cliente en el momento que sea necesario.
- **📮Inversión de Control (IoC)**: Permite reutilizar código en diversas partes del programa sin necesidad de que gestionen sus propias dependencias, pues estas estarán delegadas a un contenedor o *framework* de más alto nivel.
- 📮**Modelo Vista - Controlador (MVC):** Al estar ligado al modelo vista-controlador permitirá tener una estructura estandarizada, no solamente para manejar los elementos internos sino también para consumir correctamente la información proveída
- 📮**Minimizar la escritura de código repetitivo**: Gracias a los elementos anteriormente mencionados, se puede minimizar la creación de código anteriormente establecido, pues su utilidad es referenciar dicho código para su posterior implementación.
- 📮**Bases generales auto-gestionadas**: Elementos tales como la seguridad, manejo de información, implementación de vistas serán elementos que podrán ser gestionados con mayor facilidad desde un framework.

## 1.2. ¿Que es una API?

Una interfaz de programación de aplicaciones (API) es una especificación diseñada para ser utilizada como interfaz por componentes de software para comunicarse entre sí. Una API puede incluir especificaciones para rutinas, estructuras de datos, clases de objetos y variables. La especificación de una API puede adoptar diversas formas, como un Estándar Internacional, documentación del proveedor o las bibliotecas de un lenguaje de programación, como la Biblioteca de Plantillas Estándar en C++ o la API de Java.

### Protocolos en APIs

📮**SOAP (Simple Object Access Protocol):** SOAP, lanzado a finales de la década de 1990, es un protocolo de comunicación que utiliza XML para el formato de datos. Su fortaleza clave radica en su amplio uso y aceptación en entornos empresariales. Proporciona estándares robustos para la seguridad y las transacciones, siendo comúnmente empleado en servicios web donde la interoperabilidad entre sistemas diversos es esencial.

**📮REST (Representational State Transfer):** Introducido en el año 2000, REST es una arquitectura de estilo que utiliza los métodos estándar de HTTP para el diseño de servicios web. Se destaca por su flexibilidad en el formato de datos, permitiendo el uso de varios formatos como JSON o XML. REST se centra en la simplicidad y escalabilidad, siendo ampliamente adoptado en el desarrollo web y móvil debido a su enfoque en la representación de recursos.

**📮JSON-RPC:** JSON-RPC, desarrollado a mediados de la década de 2000, es un protocolo ligero que utiliza el formato JSON para la comunicación entre sistemas. Su fortaleza principal reside en la simplicidad de implementación, ya que define una estructura clara para el envío de llamadas a procedimientos remotos y la recepción de respuestas.

**📮gRPC:** Lanzado en 2015, gRPC es un framework de comunicación desarrollado por Google. Utiliza Protocol Buffers como formato de datos por defecto, pero también es compatible con JSON y otros. La fortaleza clave de gRPC radica en su capacidad para definir cualquier tipo de función, proporcionando eficiencia y soporte para características avanzadas como la bidireccionalidad y el streaming.

**📮GraphQL:** GraphQL, surgido en 2015, es un lenguaje de consulta para APIs que permite a los clientes solicitar datos de manera personalizada. Utilizando JSON como formato de datos, su principal fortaleza es la flexibilidad en la estructuración de datos. Los clientes pueden especificar la forma y la cantidad exacta de datos que necesitan, evitando la sobreobtención de información.

**📮Thrift:** Thrift, desarrollado en 2007 por Apache, es un framework para servicios RPC que puede utilizar JSON o formato binario. Su fortaleza clave es su capacidad para adaptarse a diversos casos de uso. Conocido por su velocidad y eficiencia, Thrift es utilizado en una variedad de aplicaciones y sistemas distribuidos para la comunicación eficiente entre componentes.

## 1.3. ¿Qué es SpringBoot?

Spring Boot es un marco de desarrollo avanzado que ha revolucionado el panorama de desarrollo de aplicaciones Java empresariales. Diseñado para simplificar el proceso de creación, configuración y despliegue de aplicaciones, Spring Boot se destaca por su enfoque en la convención sobre la configuración, lo que significa que los desarrolladores pueden concentrarse en la lógica de negocio sin la carga de configuraciones extensas. Al utilizar anotaciones y proporcionar una estructura de proyecto bien definida, Spring Boot elimina gran parte de la complejidad asociada con la configuración manual de un proyecto Spring tradicional.

Una característica distintiva de Spring Boot es su capacidad para empaquetar aplicaciones como archivos ejecutables independientes, ya sea en formato JAR o WAR, lo que simplifica significativamente el despliegue y la gestión de dependencias. Además, Spring Boot ofrece una amplia integración con tecnologías modernas, como Spring Data JPA para el acceso a bases de datos, Spring Security para la implementación de medidas de seguridad, y Thymeleaf para el desarrollo de vistas en aplicaciones web.

Al igual que esto hay otras características representativas las cuales son las siguientes:

- 📮**Configuración Automática:** Spring Boot realiza la configuración automática, lo que significa que intenta configurar la aplicación basándose en las dependencias presentes en el proyecto. Esto reduce la cantidad de configuración manual que un desarrollador necesita realizar.
- 📮**Incrustación de Servidor:** Spring Boot incluye servidores integrados como Tomcat, Jetty o Undertow, lo que significa que no es necesario configurar un servidor por separado para ejecutar la aplicación. Puedes empaquetar la aplicación como un archivo JAR ejecutable o un archivo WAR para implementarla en un servidor.
- **📮Inicio Rápido:** Spring Boot facilita la creación de aplicaciones con un inicio rápido. Con unas pocas anotaciones y configuraciones mínimas, puedes desarrollar aplicaciones funcionales de manera rápida.
- **📮Microservicios:** Spring Boot es ampliamente utilizado en el desarrollo de arquitecturas de microservicios. Facilita la creación de servicios independientes que se pueden implementar y escalar de manera independiente.
- 📮**Gestión de Dependencias:** Spring Boot utiliza Spring Boot Starter, que son dependencias preconfiguradas para varias tecnologías y frameworks. Esto facilita la inclusión de las dependencias necesarias en tu proyecto.
- 📮**Monitorización y Actuadores:** Spring Boot incluye un conjunto de actuadores que proporcionan características de monitorización y administración, como la información sobre la aplicación, la salud del sistema y la gestión de los beans de Spring.
- 📮**Soporte para Spring Ecosystem:** Spring Boot se integra bien con otros proyectos del ecosistema Spring, como Spring Data, Spring Security y Spring Cloud, para facilitar el desarrollo de aplicaciones más completas.

## 1.4. ¿Qué es un Java Bean?

Un "Bean" en el contexto del framework Spring se define como **un objeto administrado, creado y controlado por el contenedor de Spring**. Estos objetos son utilizados para encapsular y proveer servicios, utilidades y funcionalidades a otros componentes dentro de una aplicación. En Spring Boot se usa la anotación "@Bean" declarar un método como un bean. Este método debe retornar un objeto que se desea registrar como un bean en el contenedor de Spring y este último se encargará entonces de gestionar el ciclo de vida y de inyectarlo en otros componentes según sea necesario.

Los Java Bean tienen una serie de características y funcionalidades, las cuales son las siguientes:

1. 📮**Reutilizable**: Los Beans están diseñados para ser empleados en distintas aplicaciones, lo que simplifica el proceso de desarrollo y mantenimiento del software.
2. 📮**Manipulable visualmente**: Los Beans pueden ser manejados de manera visual en herramientas de desarrollo como los Entornos de Desarrollo Integrados (IDEs), facilitando así su utilización por parte de los desarrolladores.
3. 📮**Serializable**: Los Beans pueden ser convertidos en una secuencia de bytes, lo que posibilita su almacenamiento y transmisión entre diferentes sistemas a través de la red o en dispositivos de almacenamiento.
4. 📮**Propiedades**: Los Beans poseen propiedades que encapsulan tanto datos como comportamiento. Estas propiedades pueden ser de solo lectura o de lectura y escritura, dependiendo de la configuración deseada.
5. 📮**Métodos**: Los Beans contienen métodos que permiten acceder y modificar sus propiedades. Los más comunes son los métodos getter, que permiten obtener el valor de una propiedad, y los setter, que permiten establecer o modificar el valor de una propiedad.
6. 📮**Eventos**: Los Beans tienen la capacidad de generar eventos para informar a otros componentes sobre cambios en su estado, lo que facilita la comunicación entre distintos elementos de un sistema.
7. **📮Introspección**: Los Beans pueden ser examinados por herramientas de desarrollo para obtener información sobre sus propiedades y métodos, lo que facilita su manipulación y utilización en el proceso de desarrollo de software.

### 1.4.1 Ciclo de vida de Bean

El ciclo de vida de un bean en Spring Boot es el conjunto de fases que atraviesa un bean desde su creación hasta su destrucción. El contenedor de Spring Boot administra el ciclo de vida de los beans, proporcionando una serie de métodos de devolución de llamada que pueden ser usados para realizar tareas específicas en cada fase.

Las fases del ciclo de vida de un bean en Spring Boot son las siguientes:

- 📮**Instantiation:** En esta fase, el contenedor de Spring Boot crea una instancia del bean.
- 📮**Configuration:** En esta fase, el contenedor de Spring Boot llama a los métodos de configuración del bean.
- 📮**Initialization:** En esta fase, el contenedor de Spring Boot llama a los métodos de inicialización del bean.
- **📮Ready:** En esta fase, el bean está listo para ser utilizado.
- 📮**Destruction:** En esta fase, el contenedor de Spring Boot destruye el bean.

## 1.5. Configuración JDK y JRE

### 1.5.1 El JDK: La Base para Programar en Java

El **JDK** (Java Development Kit) es esencial para comenzar a programar en Java, ya que proporciona todas las herramientas necesarias para compilar, ejecutar y depurar aplicaciones.

📮Pasos para Ejecutar un Programa en Java

🔑**Instalar el JDK**: Es indispensable para compilar y ejecutar programas Java.

🔑**Configurar un IDE o Editor**: Un entorno de desarrollo integrado, como IntelliJ IDEA o Apache NetBeans, facilita la escritura y depuración del código.

**🔑Escribir el Código**: Desarrolla tu programa en un archivo con la extensión `.java`.

**🔑Compilar el Código**: Usa el comando `javac` para convertir el código fuente en bytecode.

**🔑Ejecutar el Programa**: Emplea el comando `java` para ejecutar el bytecode generado.

### 1.5.2 Datos Importantes

🔑El **JDK** contiene todas las herramientas necesarias para desarrollar y ejecutar programas Java.

🔑Un **IDE** como IntelliJ IDEA, Apache NetBeans o Eclipse ofrece funcionalidades adicionales que simplifican el desarrollo.

🔑Los pasos de **compilación** y **ejecución** son fundamentales para transformar el código en una aplicación funcional.

------

### 1.5.3 ¿Qué es un Compilador y Por Qué es Necesario en Java?

Un **compilador** es una herramienta que traduce el código fuente escrito en un lenguaje de alto nivel (como Java) a un lenguaje de bajo nivel o código máquina que puede ser ejecutado directamente por el sistema operativo.

📮Importancia del Compilador en Java

En Java, el compilador **`javac`** convierte el código fuente (archivos `.java`) en **bytecode** (archivos `.class`). El bytecode es un formato intermedio que no depende de ninguna plataforma específica. Esto permite que el programa sea ejecutado en cualquier sistema operativo que tenga una **Máquina Virtual Java (JVM)** instalada.

### 1.5.4 ¿Qué es el JDK?

El **Java Development Kit (JDK)** es un conjunto de herramientas esenciales para desarrollar aplicaciones en Java. Sus principales componentes incluyen:

1. **Compilador (javac)**: Convierte el código fuente Java en bytecode.
2. **Java Runtime Environment (JRE)**: Contiene las bibliotecas y la JVM necesarias para ejecutar el bytecode.
3. **Herramientas de Desarrollo**: Incluye utilidades como el depurador (**jdb**) y el empaquetador (**jar**), entre otras.

### 1.5.5 ¿Qué es el JRE?

El **Java Runtime Environment (JRE)** es un subconjunto del JDK diseñado exclusivamente para ejecutar programas Java. Sus componentes clave son:

1. **JVM (Java Virtual Machine)**: Responsable de interpretar y ejecutar el bytecode.
2. **Bibliotecas de Clase**: Proveen las funcionalidades necesarias para que las aplicaciones Java puedan ejecutarse.
3. **Otros Componentes**: Incluyen archivos de configuración, bibliotecas nativas y otros elementos de soporte.

------

### 1.5.6 Relación entre JDK y JRE

- **JDK**: Es más completo, ya que incluye el JRE junto con las herramientas de desarrollo necesarias, como el compilador y depuradores.
- **JRE**: Está enfocado únicamente en la ejecución de aplicaciones Java, sin herramientas de desarrollo.

### 1.5.7 Instalación

1. Ingrese al sitio web oficial https://adoptium.net/es/temurin/releases/

2. Seleccione el sistema operativo, la arquitectura, el tipo de paquete y la versión a instalar. Para el desarrollo de esta guia sugerimos la siguiente configuración para sistemas operativos Windows.

   > Descargue los instaladores .msi para mayor facilidad y confiabilidad en el proceso de instalación

   ![](https://i.ibb.co/cY8vq8f/image.png)

3. Instale primero el JDK y posteriormente el JRE

## 1.2 Configuración IDE

### 1.2.1 Visual Studio Code

Visual Studio Code (VS Code) es un editor de texto y desarrollador de código en línea gratuito que se basa en el proyecto Visual Studio. Es similar a Microsoft Word o Notepad++, pero con características más avanzadas y funcionalidades adicionales.

**Características clave de VS Code:**

1. **Compatibilidad con proyectos de desarrollo**: VS Code puede trabajar con todos los proyectos de desarrollo, incluyendo IDEs como IntelliJ IDEA, Eclipse, NetBeans y más.
2. **Integración con lenguajes de programación**: VS Code se integra bien con varios lenguajes de programación, incluyendo JavaScript, Python, Java, C#, C++, Ruby, etc.
3. **Soporte para múltiples entornos de desarrollo**: VS Code ofrece soporte para desarrolladores que trabajan en diferentes entornos de desarrollo, como Azure, AWS, Heroku, etc.
4. **Integración con herramientas de desarrollo**: VS Code ofrece integraciones con herramientas de desarrollo populares, como Git, Node.js, React, Angular, Vue.js, etc.
5. **Compatibilidad con bases de datos relativas y absolutas**: VS Code puede trabajar con bases de datos relativas y absolutas, incluyendo MySQL, PostgreSQL, MongoDB, SQLite, etc.
6. **Soporte para el código de código fuente**: VS Code tiene un sistema de gestión de código de fuente muy avanzado, lo que permite a los desarrolladores crear y mantener proyectos más complejos.
7. **Compatibilidad con la plataforma Mac y Windows**: VS Code está disponible para ambos sistemas operativos.

**Funcionalidades adicionales de VS Code:**

1. **Integración con lenguajes de programación orientados a objetos (OOP)**: VS Code tiene una gran cantidad de extensiones que integran con los lenguajes de OOP populares, como Java, C#, Python, JavaScript, etc.
2. **Soporte para la programación de microservicios**: VS Code ofrece herramientas y funcionalidades específicas para el desarrollo de microservicios, como la creación de servicios RESTful y la integración con servidores en tiempo real.
3. **Integración con lenguajes de programación de Python y R**: VS Code tiene extensões que integran con Python y R, lo que permite a los desarrolladores trabajar con estos lenguajes de programación de manera más efectiva.

**Ventajas de usar VS Code:**

1. **Flexibilidad y personalización**: VS Code ofrece una gran cantidad de configuraciones y extensiones personalizables para adaptarse a las necesidades específicas de cada proyecto.
2. **Productividad**: VS Code es un editor de código que se enfoca en la eficiencia y la productividad, lo que puede ayudar a los desarrolladores a escribir más rápido y a realizar tareas de código más rápidamente.
3. **Compatibilidad con proyectos de desarrollo modernos**: VS Code está diseñado para trabajar con proyectos de desarrollo modernos, incluyendo aquellos que utilizan tecnologías como Docker, Kubernetes, etc.

**Desventajas de usar VS Code:**

1. **Costo**: VS Code puede ser más costoso que otros editors de código, especialmente si se utiliza en un entorno profesional.
2. **Aprendizaje y configuración**: Los desarrolladores pueden necesitar un poco de tiempo para aprender a utilizar VS Code y adaptarse a sus necesidades específicas.

En resumen, VS Code es un editor de código y desarrollador de código en línea que ofrece una gran cantidad de características y funcionalidades para trabajar con proyectos de desarrollo modernos.

### 1.2.2 Configuración VisualStudio Code

1. Instalar visual studio code desde la pagina oficial  https://code.visualstudio.com/

   ![](https://i.ibb.co/M5C57X52/image.png)

   2. Después de instalar visual studio code abralo y cree un nuevo perfil como desarrollador JavaSpringBoot

      ![](https://i.ibb.co/F4DKdtF1/image.png)

      en la ventana de creación de perfiles haga clic en el boton New Profile

      ![](https://i.ibb.co/9mKh29jd/image.png)

      Llene el formulario con el nombre del nuevo perfil y si desea que el perfil que se esta creando herede las caracteristicas de otro perfil lo puede seleccionar en las opciones indicadas.

      ![](https://i.ibb.co/JwnzCv4C/image.png)

      **1️⃣- Nombre del Perfil:**

      - Esta opción permite asignar un nombre personalizado al nuevo perfil que se está creando. En la imagen, el usuario ha nombrado el perfil como **"JavaSpringBoot"**.
      - Los perfiles en Visual Studio Code permiten personalizar la configuración, extensiones y preferencias para diferentes proyectos o entornos de trabajo.

      **2️⃣ - Copiar desde otro perfil:**

      - Esta opción permite seleccionar un perfil existente como base para el nuevo perfil.
      - Si se elige un perfil en el desplegable, el nuevo perfil copiará configuraciones y preferencias del perfil seleccionado.
      - En la imagen, la opción seleccionada es **"None"**, lo que significa que el nuevo perfil se creará vacío sin copiar configuraciones de otro perfil.

      **3️⃣ - Contenido del Perfil:**

      - Esta sección permite definir qué configuraciones específicas se incluirán en el nuevo perfil.
      - Se pueden configurar diferentes contenidos como:
        - **Settings (Configuraciones)**
        - **Keyboard Shortcuts (Atajos de teclado)**
        - **Tasks (Tareas)**
      - En la columna "Source", se muestra si estos elementos serán heredados del perfil "Default" o si estarán vacíos ("None").

   3. Haga clic en el boton Create para finalizar la creación del nuevo perfil

      ![](https://i.ibb.co/wZsfQfFC/image.png)

   4. Para finalizar puede activar el perfil por defecto haciendo clic en el botón ✔

      ![](https://i.ibb.co/SwVrHSHH/image.png)

   5. Haga clic en el boton de Administración de extensiones en visual studio code para instalar y personalizar las extensiones de desarrollo teniendo en cuenta la tecnología a usar.

      ![](https://i.ibb.co/tTp91nDb/image.png)

      Extensiones requeridas:

      ![](https://i.ibb.co/Tx0wFXbg/image.png)

      La extensión **"Extension Pack for Java"** de Microsoft para Visual Studio Code es un paquete de extensiones diseñadas para facilitar el desarrollo en Java dentro del editor. Su propósito es proporcionar herramientas esenciales para programar en Java con funcionalidades avanzadas.

      ### **¿Qué ofrece esta extensión?**

      Este paquete incluye varias extensiones populares para el desarrollo en Java, tales como:

      1. **Java IntelliSense** – Proporciona autocompletado inteligente y sugerencias mientras escribes código.
      2. **Depuración (Debugging)** – Permite ejecutar y depurar aplicaciones Java directamente en VS Code.
      3. **Testing** – Soporte para escribir y ejecutar pruebas unitarias en Java.
      4. **Maven/Gradle** – Integración con herramientas de construcción como Maven y Gradle para gestionar dependencias y compilaciones.
      5. **Soporte para Servidores y Frameworks** – Compatibilidad con Spring Boot, Quarkus y otras herramientas de backend en Java.
      6. **Explorador de proyectos** – Facilita la navegación entre archivos, clases y métodos dentro de proyectos Java.

      ![](https://i.ibb.co/5WpRKxnr/image.png) 

      La extensión **"Spring Boot Dashboard"** para **Visual Studio Code** es una herramienta diseñada para facilitar el desarrollo y la gestión de aplicaciones **Spring Boot** dentro del editor.

      ### **¿Para qué sirve esta extensión?**

      Esta extensión proporciona un **panel de control (dashboard)** para gestionar y monitorear proyectos de **Spring Boot** directamente desde VS Code. Sus funcionalidades incluyen:

      1. **Inicio y detención de aplicaciones Spring Boot** desde el panel sin necesidad de usar la terminal.
      2. **Visualización de aplicaciones en ejecución**, permitiendo ver detalles como puertos, perfiles y configuración activa.
      3. **Monitoreo de logs en tiempo real**, facilitando la depuración de aplicaciones.
      4. **Integración con Spring Boot Actuator**, permitiendo acceder a métricas, endpoints y estado de la aplicación de forma rápida.
      5. **Manejo de múltiples proyectos Spring Boot**, ideal si trabajas en microservicios o varias aplicaciones simultáneamente.

      ![](https://i.ibb.co/7x1tfRCM/image.png)

      La extensión **"Spring Boot Tools"** para **Visual Studio Code**, desarrollada por **VMware**, está diseñada para mejorar la experiencia de desarrollo con **Spring Boot**, proporcionando herramientas esenciales para la configuración y validación de archivos de propiedades.

      ### **¿Para qué sirve esta extensión?**

      Esta extensión facilita el trabajo con archivos de configuración de **Spring Boot**, específicamente:

      1. **Asistencia en la configuración de archivos**
         - Proporciona autocompletado y sugerencias en archivos `application.properties` y `application.yml`.
         - Ayuda a evitar errores de sintaxis y configuraciones incorrectas.
      2. **Validación de configuración**
         - Detecta errores en las propiedades de configuración de Spring Boot.
         - Advierte sobre propiedades obsoletas o mal configuradas.
      3. **Mejor integración con Spring Boot Actuator**
         - Proporciona herramientas para gestionar y monitorear la aplicación.
         - Permite visualizar endpoints disponibles y configuraciones activas.
      4. **Optimización del flujo de trabajo**
         - Mejora la edición y navegación en proyectos Spring Boot.
         - Compatible con otras extensiones de Spring Boot para VS Code.

      ![](https://i.ibb.co/JRLzx1nq/image.png)

# 2. Introducción a SpringBoot

## 2.1. Creación de proyectos SpringBoot

Para la creación de un proyecto siga las siguientes recomendaciones:

1. Cree una carpeta principal donde se almacenaran todos los proyectos que va a desarrollar

2. El nombre de la carpeta no debe tener espacios en blanco ni caracteres especiales.

   Para este esta guia se creara un folder llamado springprojects

   ![](https://i.ibb.co/fVnv8mXJ/image.png)

3. Abra Visual Studio Code y presione Ctrl+Shif+P para abrir la paleta de comandos

en la caja de texto escriba Spring init:

![Screenshot_2](https://i.ibb.co/4tRQYW5/Screenshot-2.png)

**Spring Initializr: Add Starters...**

- Esta opción permite **agregar dependencias (starters)** a un proyecto de Spring Boot existente. Los *starters* son conjuntos predefinidos de dependencias que proporcionan funcionalidades como desarrollo web, seguridad, bases de datos, mensajería, entre otros.

**Spring Initializr: Create a Gradle Project...**

- Esta opción ayuda a generar un **nuevo proyecto de Spring Boot** utilizando **Gradle** como herramienta de construcción (*build tool*). Gradle es una alternativa a Maven y se usa por su rapidez en la resolución de dependencias y su flexibilidad en la configuración de proyectos.

**Spring Initializr: Create a Maven Project...**

- Esta opción permite generar un **nuevo proyecto de Spring Boot** utilizando **Maven** como herramienta de construcción. Maven es muy popular en el ecosistema Java para la gestión de dependencias y la automatización de compilaciones.

Para esta guia se usara maven. y la version LTS  no se recomienda usar la versión  SNAPSHOOT.

<img src="https://i.ibb.co/j9Ts276h/image.png" style="zoom:67%;" />

<img src="https://i.ibb.co/v6Vh5Nsq/image.png" style="zoom:67%;" />

Como lenguaje de desarrollo se usara Java.

<img src="https://i.ibb.co/6JD49BjX/image.png" style="zoom:67%;" />

A continuación especifique el grupo ID. el grupo Id debe tener el formato com.company

![](https://i.ibb.co/kVwC7p1K/image.png)

**¿Qué es el Group ID?**

El **Group ID** es un identificador único para tu proyecto, siguiendo la convención de nombres de paquetes en Java (generalmente en notación de nombre de dominio en reversa).
Ayuda a **organizar e identificar** tu proyecto de manera única dentro de un ecosistema más amplio.

**Ejemplos de Group ID:**

- `com.example`
- `org.mycompany`
- `com.tunombre.proyecto`

**¿Cuándo lo necesitas?**

- Al configurar un **nuevo proyecto de Spring Boot** en **Maven o Gradle**.
- Se usa en la **estructura de paquetes** de tus clases en Java.
- Es un campo **obligatorio** en los archivos **`pom.xml` (Maven)** o **`build.gradle` (Gradle)**.

**¿Cómo elegir un Group ID?**

✅ **Si trabajas en un proyecto personal:**

- Usa algo como: `com.tunombre.proyecto`

🏢 **Si trabajas en un proyecto empresarial:**

- Usa el dominio de tu empresa en reversa, por ejemplo: `com.empresa.aplicacion`

🌍 **Si es un proyecto de código abierto:**

- Sigue una convención general, como: `org.ejemplo.proyecto`

Especifique el nombre del proyecto:

<img src="https://i.ibb.co/b5YxmX2B/image.png" style="zoom:80%;" />

<img src="https://i.ibb.co/b5WnFYkB/image.png" style="zoom:80%;" />

**¿Qué es el Artifact ID?**

- El **Artifact ID** es el **nombre del proyecto** y se utilizará como el **nombre base para tu archivo JAR o WAR** al compilar la aplicación.
- Generalmente es un **identificador corto en minúsculas** que representa el proyecto.

**Ejemplos de Artifact ID:**

- `miaplicacion`
- `spring-demo`
- `ecommerce-backend`

Especifique el tipo de empaquetado. Para esta guia se usara Jar.

<img src="https://i.ibb.co/tp2bNqzq/image.png" style="zoom: 80%;" />

Seleccione la versión del JDK. Para esta versión se debe usar la versión 17.

<img src="https://i.ibb.co/cKK1R7qv/image.png" style="zoom:80%;" />

**Versiones de Java:**

1. **Java 17** (LTS - Soporte a Largo Plazo) ✅ **Recomendado**
   - Estable y ampliamente utilizado.
   - Versión **LTS oficial** con soporte hasta **al menos 2029**.
   - Compatible con **Spring Boot 3+**.
   - La mejor opción para la mayoría de las **aplicaciones empresariales**.
2. **Java 21** (LTS - Soporte a Largo Plazo)
   - La versión **LTS más reciente**, lanzada en **septiembre de 2023**.
   - Ofrece **mejoras de rendimiento** y nuevas características.
   - Totalmente compatible con **Spring Boot 3+**.
   - Buena opción si deseas las últimas características de un LTS.
3. **Java 25** (No-LTS, Versión Futura)
   - **No es una versión LTS**.
   - Puede incluir características experimentales.
   - Aún no es ampliamente adoptado en entornos de producción.
   - Solo elige esta opción si deseas probar funciones avanzadas en desarrollo.

**¿Cuál deberías elegir?**

- ✅ **Java 17** → **Mejor opción por estabilidad y compatibilidad**.
- 🚀 **Java 21** → Buena opción si deseas la última versión LTS.
- ⚠️ **Java 25** → Solo para pruebas de nuevas características.

Seleccione las dependencia a incorporar en el proyecto. Para esta guía incorporar las siguientes dependencias.

![](https://i.ibb.co/DmCSn8L/image.png)

<img src="https://i.ibb.co/Q3RfkSgV/image.png" style="zoom:80%;" />

**Dependencias Seleccionadas:**

1. **Spring Web** 🌐 (Para construir APIs RESTful y aplicaciones web)
   - Necesario para desarrollar **servicios web RESTful** y **aplicaciones Spring MVC**.
   - Usa **Apache Tomcat** como servidor embebido predeterminado.
2. **MySQL Driver** 🛢️ (Para conectarse a bases de datos MySQL)
   - Proporciona el **controlador JDBC** necesario para interactuar con una **base de datos MySQL**.
3. **Spring Boot DevTools** ⚡ (Para recarga en caliente y desarrollo más rápido)
   - Habilita **LiveReload**, **reinicio automático de la aplicación**, y configuraciones optimizadas para desarrollo.
4. **Lombok** ✍️ (Para reducir el código repetitivo)
   - Biblioteca de Java que reduce el **código boilerplate** proporcionando **generación automática de getters/setters**, **constructores** y **registro de logs** a través de anotaciones.
5. **Spring Data JPA** 📦 (Para interacción con bases de datos usando JPA/Hibernate)
   - Simplifica el **acceso a bases de datos** utilizando **Spring Data**.
   - Funciona con **Hibernate** como proveedor JPA predeterminado.
6. **Thymeleaf** 🖥️ (Para renderización de HTML en el servidor)
   - Un **motor de plantillas** utilizado para renderizar dinámicamente **vistas HTML**.
   - Comúnmente utilizado en **aplicaciones web basadas en MVC**.

**¿Qué te permite construir esta configuración?**

- Una **aplicación web** con una **base de datos MySQL**.
- Usa **Spring Data JPA** para la persistencia de datos.
- Proporciona **recarga en caliente** con **DevTools**.
- Reduce el **código repetitivo** con **Lombok**.
- Usa **Thymeleaf** para renderizar páginas HTML dinámicamente.

**¿Es esta configuración adecuada para tu proyecto?**

✅ **Ideal para:**

- Aplicaciones web con **Spring MVC**.
- Aplicaciones **CRUD** con **MySQL** o PostgreSQL.
- Proyectos que requieren **desarrollo rápido con DevTools**.

💡 **Si planeas construir solo una API REST sin vistas**, puede **omitir Thymeleaf**. 🚀

Seleccione la carpeta donde se creara el proyecto. Recuerde que es necesario contar con conexión a internet.

<img src="https://i.ibb.co/WpBggwXF/image.png" style="zoom:80%;" />

## 2.2 Abriendo el proyecto en visual studio code

1. Abra visual studio code

2. Haga clic en el menu file Open Folder y seleccione la carpeta del proyecto que creo.

   ![](https://i.ibb.co/KcFT4vhk/image.png)

   ![](https://i.ibb.co/1Y3Pj0zm/image.png)

## 2.3 Estructura de archivos del proyecto

![](https://i.ibb.co/nFfYM6b/image.png)

📁 **.mvn/**

- Carpeta interna de **Maven Wrapper**, contiene archivos de configuración para ejecutar Maven sin necesidad de instalarlo manualmente.

📁 **.vscode/**

- Carpeta específica de **Visual Studio Code** que almacena configuraciones del editor para este proyecto.

📁 **src/**

- Contiene el 

  código fuente del proyecto

  . Se divide en dos subdirectorios principales:

  - **`src/main/java/`** → Contiene las clases Java del proyecto.
  - **`src/main/resources/`** → Contiene recursos como archivos de configuración (`application.properties` o `application.yml`), plantillas HTML (si usas **Thymeleaf**) y otros archivos estáticos.
  - **`src/test/java/`** → Contiene las pruebas unitarias y de integración.

📁 **target/**

- Carpeta donde se **compilan y empaquetan los archivos del proyecto**. Se genera al ejecutar `mvn package` o `mvn install`.

📄 **.gitattributes**

- Archivo de **Git** que define configuraciones específicas para manejar archivos en el repositorio.

📄 **.gitignore**

- Archivo de **Git** que define qué archivos o carpetas deben **excluirse** del control de versiones, como `target/` y archivos temporales.

📄 **HELP.md**

- Archivo de ayuda generado por **Spring Initializr**, contiene información sobre la estructura del proyecto y cómo ejecutarlo.

📄 **mvnw** y **mvnw.cmd**

- Maven Wrapper

  : Permite ejecutar Maven sin necesidad de instalarlo globalmente en el sistema.

  - **`mvnw`** → Se usa en **Linux/macOS**.
  - **`mvnw.cmd`** → Se usa en **Windows**.

📄 **pom.xml**

- Archivo de configuración principal de Maven

  - Define **dependencias** del proyecto (Spring Boot, JPA, Lombok, etc.).

  - Configura **versiones**, **plugins** y otros parámetros del proyecto.

  - Se ejecuta con comandos como:

    ```
    shCopiarEditarmvn clean install  # Compila y empaqueta el proyecto
    mvn spring-boot:run  # Ejecuta la aplicación
    ```

------

✅ **Resumen**

- 📂 **`src/`** → Código fuente del proyecto.
- 📂 **`target/`** → Carpeta de salida con el JAR/WAR compilado.
- 📄 **`pom.xml`** → Configuración principal del proyecto (dependencias, plugins, etc.).
- 📄 **`mvnw` y `mvnw.cmd`** → Scripts para ejecutar Maven sin instalación.
- 📄 **`.gitignore` y `.gitattributes`** → Configuraciones para Git.

Clase principal @SpringBootApplication

![](https://i.ibb.co/vvXJDpjh/image.png)

`@SpringBootApplication` es una anotación en Spring Boot que se utiliza para marcar una clase principal de la aplicación Spring Boot. Esta anotación combina varias anotaciones de Spring en una sola, simplificando la configuración y el inicio de la aplicación.

A continuación se listan algunas funciones especiales de @SpringBootApplication

1. **Configuración de la aplicación**: Esta anotación incluye `@Configuration`, lo que significa que la clase marcada con `@SpringBootApplication` puede contener métodos anotados con `@Bean`, los cuales definirán los componentes y configuraciones de Spring.
2. **Component scanning**: `@SpringBootApplication` incluye `@ComponentScan`, que permite a Spring Boot escanear y detectar automáticamente los componentes de la aplicación (como controladores, servicios y repositorios) dentro del paquete base de la clase anotada y sus subpaquetes.
3. **Arranque de la aplicación**: `@SpringBootApplication` incluye `@EnableAutoConfiguration`, que permite la configuración automática de la aplicación basada en las dependencias presentes en el classpath. Esto simplifica significativamente la configuración de la aplicación al reducir la necesidad de configuración manual.
4. **Clase principal de la aplicación**: Al marcar una clase con `@SpringBootApplication` y especificarla como la clase principal en el archivo `pom.xml` o `build.gradle`, se define el punto de entrada de la aplicación Spring Boot. Esta clase contiene el método `main()` que inicia la aplicación y carga el contexto de Spring.

## 2.4 Creación de paginas usando Thymeleaf

### 2.4.1 Requerimientos

#### 2.4.1.1 . Requisitos previos

Antes de empezar, asegúrate de tener lo siguiente instalado:

- **Java** (JDK 8 o superior).
- **Spring Boot** configurado en tu proyecto.
- Un **IDE** como IntelliJ IDEA o VS Code con soporte para Spring Boot.
- **Maven** o **Gradle** para la gestión de dependencias.

------

#### 2.4.1.2. Agregar la dependencia de Thymeleaf

Si usas **Maven**, en tu archivo `pom.xml`, agrega:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

Si usas **Gradle**, en `build.gradle` agrega:

```java
{
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
}
```

> Se recomienda realizar la importacion de Thymeleaf cuando este creando el proyecto.

Para comenzar a trabajar con Thymeleaf vamos a crear un nuevo proyecto utilizando el asistente de creación de proyectos de Spring boot. Recordemos que para iniciar el panel de comandos de visual Studio code debemos presionar las teclas Ctrl + Shift + P.

Para esta guía vamos a utilizar únicamente 3 dependencias las cuales se muestran en la figura a continuación 

![](https://i.ibb.co/PvYdMGkN/image.png)

Como recomendacion  personal les aconsejo trabajar con la pestaña de Java Project ya que podremos visualizar la estructura del proyecto como la visualizaríamos típicamente en entornos de desarrollo integrados como netbeans, eclipse. 

<img src="https://i.ibb.co/ZzjF4sqh/image.png" style="zoom:80%;" />

Otro tip importante al momento de trabajar con visual Studio es activar la opción de visualización en forma de jerarquía ya que nos va a permitir visualizar todos los archivos y estructura del proyecto de una manera más amplia y entendible. 

![](https://i.ibb.co/B2HL4hsK/image.png)

Cuando se crea el proyecto utilizando el inicializador de Spring bood automáticamente se crea una estructura base la cual nos va a permitir organizar de forma adecuada cada una de las clases y artefactos de software que tenemos que crear durante el proceso de desarrollo. En la estructura del proyecto vamos a encontrar un paquete llamado src/main/resources y de dentro de dicho paquete vamos a encontrar una carpeta llamada templates y static. En la carpeta templates debemos crear todas las vistas HTML de nuestro proyecto en la carpeta static vamos a poder ubicar recursos externos o archivos externos al proyecto como imágenes script de javascript e incluso estilo CSS. 

#### 2.4.1.3 Como crear documentos Web(Html)

Para la creación del documento web HTML se debe seleccionar el paquete resource y dar clic derecho sobre la carpeta templates y a continuación seleccionar la opción file. Otra forma de crear el archivo es haciendo clic sobre el icono + el cual se encuentra ubicado a la derecha del título templates. 

**Opcion 1**

![](https://i.ibb.co/nMbZPczq/image.png)

**Opcion 2**

<img src="https://i.ibb.co/8LJPbBTc/image.png" style="zoom:80%;" />

> Recuerde pulsar enter cuando ingrese el nombre del recurso a crear.

Cree un documento html llamado index.html ![](https://i.ibb.co/SXkG47nC/image.png) 

## 2.5 Creacion del Controlador

Para crear un controlador lo primero que tenemos que llevar a cabo es la creación de un paquete el cual se encuentra referenciado al paquete principal para esto se debe seleccionar el paquete principal del proyecto y se hace clic en el icono representado con el símbolo + para la creación de un nuevo recurso de Java ya sea clase, paquete, interfaz etc. 

![](https://i.ibb.co/1f6V5rVp/image.png)

### 2.5.1¿Qué es un Controlador en Spring Boot?

Un **controlador** en Spring Boot es una clase que gestiona las solicitudes HTTP y define cómo se procesan las peticiones y respuestas dentro de la aplicación. Se encarga de recibir datos desde el cliente (navegador, API, etc.), procesarlos y devolver una respuesta.

------

### 2.5.2 Tipos de Controladores en Spring Boot

En Spring Boot, hay dos tipos principales de controladores:

1. **Controladores para aplicaciones web con vistas (Thymeleaf, JSP, etc.)**
   - Usan la anotación `@Controller`
   - Devuelven vistas HTML renderizadas con datos.
2. **Controladores para API REST**
   - Usan la anotación `@RestController`
   - Devuelven datos en formato JSON o XML.

------

#### 2.5.2.1 Controlador con `@Controller` para Vistas Web

Cuando se trabaja con **Thymeleaf**, se debe utilizar `@Controller` para gestionar las peticiones y retornar vistas HTML.

**Ejemplo: Controlador para cargar una vista**

```java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a mi aplicación con Spring Boot!");
        return "index"; // Carga la plantilla index.html desde src/main/resources/templates/
    }
}
```

**Explicación**

- `@Controller`: Define la clase como un controlador para manejar vistas web.
- `@GetMapping("/")`: Indica que el método responderá a una petición `GET` en la URL raíz `/`.
- `Model model`: Se usa para enviar datos a la vista (`index.html`).
- `return "index"`: Devuelve la vista `index.html`.

------

#### 2.5.2.2 Controlador REST con `@RestController`

La anotación `@RestController` en Spring Boot sirve para marcar una clase como un controlador especializado en la creación de servicios web RESTful. Esta anotación combina las funcionalidades de `@Controller` y `@ResponseBody`, lo que significa que los métodos de la clase anotada con `@RestController` devuelven directamente objetos serializados en formato JSON o XML como respuesta a las solicitudes HTTP, en lugar de depender de las vistas tradicionales.

⚠**características importantes de `@RestController`:**

​	1️⃣**Gestión de solicitudes HTTP**: Al igual que con `@Controller`, los métodos dentro de una clase anotada con `@RestController` pueden manejar las solicitudes HTTP mediante anotaciones como `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, etc.

​	2️⃣**Respuestas RESTful**: La anotación `@RestController` agrega automáticamente la anotación `@ResponseBody` a cada método en la clase, lo que indica que los resultados de los métodos son enviados directamente al cuerpo de la respuesta HTTP en lugar de ser tratados como nombres de vistas. Esto facilita la creación de servicios RESTful que devuelven datos estructurados como JSON o XML.

​	3️⃣**Serialización automática**: Spring Boot, junto con bibliotecas como Jackson, se encarga de serializar automáticamente los objetos devueltos por los métodos de un controlador `@RestController` en el formato adecuado (JSON o XML) antes de enviarlos como respuesta al cliente.

​	4️⃣**Facilidad de uso**: Al utilizar `@RestController`, se simplifica la configuración y el desarrollo de servicios web RESTful, ya que elimina la necesidad de anotar métodos individualmente con `@ResponseBody`.

**Ejemplo: Controlador REST que devuelve JSON**

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/saludo")
    public String saludo(@RequestParam(name = "nombre", defaultValue = "Usuario") String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido a la API.";
    }
}
```

**Explicación**

- `@RestController`: Indica que el controlador devuelve respuestas en **JSON** en lugar de vistas HTML.
- `@GetMapping("/saludo")`: Maneja peticiones `GET` en la URL `/saludo`.
- `@RequestParam(name = "nombre", defaultValue = "Usuario")`: Recibe un parámetro opcional llamado `nombre`.

### 2.5.3 Creando el primer controlador

Para este primer ejercicio vamos a crear un controlador que nos permita abrir la plantilla HTML llamada index que se ha creado previamente. Para crear el controlador nos ubicamos en el paquete que hemos creado previamente llamado Controller y damos clic en el símbolo + en la ventana de selección de recursos debemos seleccionar clases y a continuación ingresamos el nombre del controlador; el identificador o nombre del controlador se recomienda que tenga el prefijo Controller después del nombre que le hemos dado al controlador. 

> Es de buena práctica que el nombre del controlador tenga el mismo nombre del documento o plantilla HTML que deseamos visualizar. 

![](https://i.ibb.co/bRCkgmzB/image.png)

![](https://i.ibb.co/M5BMSnBY/image.png)



En la clase creada se debe agregar la anotación @Controller : **La anotación `@Controller` en Spring Boot cumple una función importante al marcar una clase como un controlador en el patrón de diseño Modelo-Vista-Controlador (MVC). Esta anotación específica es parte del ecosistema de Spring MVC, que es un framework de desarrollo web basado en el patrón MVC y utilizado ampliamente en aplicaciones Spring**.

<img src="https://i.ibb.co/hFMbS2xb/image.png" style="zoom:80%;" />

<img src="https://i.ibb.co/VcQd75G8/image.png" style="zoom:80%;" />

<img src="https://i.ibb.co/d4DHM9pj/image.png" style="zoom:80%;" />

El `import` trae la anotación `@Controller` del paquete `org.springframework.stereotype`. Esta anotación se usa en Spring Boot para marcar una clase como **controlador**, lo que significa que manejará peticiones HTTP y devolverá vistas.

Para poder visualizar el documento HTML creado agregue la siguiente funcionalidad a la clase index Controller. 

<img src="https://i.ibb.co/mFBkc88x/image.png" style="zoom:80%;" />

```java
package com.bksexample.startproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "Bienvenido a Spring Boot con Thymeleaf");
        return "index"; // Nombre de la vista Thymeleaf (index.html)
    }
}
```

En el documento web creado realice los siguientes cambios: 

En etiqueta HTML agregue el atributo:  ![](https://i.ibb.co/z0gd7jJ/image.png) Este atributo define un espacio de nombres XML para las funciones de Thymeleaf. Le indica al navegador y a Thymeleaf que todos los atributos que comienzan con `th:` pertenecen a **Thymeleaf** y deben ser procesados en el servidor.

Agregue un encabezado h1 y en el encabezado h1 agregue el atributo ![](https://i.ibb.co/fz8jntSK/image.png) El atributo `th:text` en Thymeleaf se usa para **reemplazar el contenido de un elemento HTML con un valor dinámico** proveniente del modelo de datos en **Spring Boot**.

![](https://i.ibb.co/QF0ndQp8/image.png)

### 2.5.4 Ejecución proyecto

Para poder ejecutar el proyecto de Spring boot vamos a hacer uso del dashboard, recordemos que el liderazgo es el panel administrar y gestionar la ejecución de proyectos y poder verificar diferentes endpoint que se encuentran configurados en el proyecto. Mientras Cuba también vamos a poder visualizar los diferentes Beans creados en el Proyecto. 

<img src="https://i.ibb.co/27nvB5pg/image.png" style="zoom:80%;" />

Para ejecutar el proyecto nos dijimos a la sección de apps en el dashboard le hacemos clic sobre el botón de ejecución run, automáticamente se levanta el servidor integrado de tomcat y podremos observar en la terminal de visual Studio code la información de inicio donde nos muestra el puerto y la o r a la cual podemos acceder desde el navegador web por defecto la dirección URL local es localhost. 

![](https://i.ibb.co/xKQDRB4D/image.png)

![](https://i.ibb.co/HDrY9hyN/image.png)

Cuando finalice la carga del servidor tomcat y todos los servicios necesarios el siguiente paso es abrir el navegador web de su preferencia y en la URL escribir la URL localhost: 8080 

<img src="https://i.ibb.co/6049PLXf/image.png" style="zoom:67%;" />

## 2.6 Parámetros

Cuando se desarrollen aplicaciones web interactivas es necesario habilitar el envío de información durante la ejecución / renderizado de las vistas(páginas web) para esto es necesario utilizar los parámetros en el interfaz grafica y en el controlador. en este apartado nos centraremos en el envío y recepción de parámetros hacia un endpoint. 

### 2.6.1 Representación de datos con Model

**Model** se utiliza dentro del patrón **MVC (Model-View-Controller)**. En este contexto, el **modelo (Model)** representa los datos de la aplicación y cómo estos se gestionan.

📌 **Uso del Model en Controladores Spring MVC**

Si se utiliza Spring MVC para gestionar peticiones web, es posible inyectar objetos en el modelo mediante la anotación `@ModelAttribute` o utilizando el parámetro `Model` dentro del controlador.

**Ejemplo**

⌨**Clase indexController**

```java
@Controller
public class indexController {
    @GetMapping("/ic")
    public String home(Model model) {
        model.addAttribute("mensaje", "Bienvenido a Spring Boot con Thymeleaf");
        model.addAttribute("nombre", "Johlver Jose Pardo");
        model.addAttribute("profesion", "Ingeniero FullStack");
        return "index"; // Nombre de la vista Thymeleaf (index.html)
    }
}
```

⌨**View index.html**

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Perfil</title>
</head>
<body>
    <h1 th:text="${mensaje}">Texto por defecto</h1>
    <h2 th:text="${nombre}">Nombre por defecto</h2>
    <p th:text="${profesion}">Profesión por defecto</p>
</body>
</html>
```

> El comando `./mvnw spring-boot:run` permite ejecutar el proyecto (Windows)

<img src="https://i.ibb.co/3mGP3Tq2/image.png" style="zoom:80%;" />

#### 2.6.2 @ModelAttribute

En **Spring Boot**, `@ModelAttribute` es una anotación utilizada en **controladores** para **preparar datos y vincular objetos a la vista** en aplicaciones web con **Thymeleaf**. Se usa principalmente para:

1. **Pasar datos a la vista antes de renderizarla**.
2. **Mapear datos del formulario al objeto en el controlador** automáticamente.
3. **Inicializar valores antes de procesar una petición**.

```java
    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
            new User("Pepa", "Gonzalez"),
            new User("Lalo", "Perez", "lalo@correo.com"),
            new User("Juanita", "Roe", "juana@correo.com"),
            new User("Andres", "Doe")
        );
        return users;
    }
```

**Uso de `@ModelAttribute` en un Controlador**

La anotación `@ModelAttribute` se puede utilizar en dos formas principales:

1. **En métodos del controlador**, para añadir atributos al `Model`.
2. **En parámetros de métodos**, para enlazar los datos de un formulario con un objeto Java.

**Ejemplo 1: Cargar datos en la vista antes de renderizarla**

Cuando usas `@ModelAttribute` en un método, este se ejecuta **antes** de que se ejecute cualquier otro método controlador en la misma clase.

📌 **Ejemplo: Pasar una lista de roles a la vista antes de que se cargue el formulario**

```java
public class UsersAuth {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;
    
    public UsersAuth() {
    }
    public UsersAuth(String firstName, String lastName, String username, String password, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
```

```java
package com.bksexample.startproject.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bksexample.startproject.domain.UsersAuth;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @ModelAttribute("roles")
    public List<String> roles() {
        return List.of("ADMIN", "USUARIO", "INVITADO");
    }

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new UsersAuth());
        return "formulario";
    }
}
```

**📌 Plantilla Thymeleaf `formulario.html`**

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Documento</title>
</head>
<body>

<form action="/usuarios/guardar" method="post" th:object="${usuario}">

    <label>Nombre:</label>
    <input type="text" th:field="*{firstName}" />

    <label>Rol:</label>
    <select th:field="*{role}">
        <option th:each="rol : ${roles}"
                th:value="${rol}"
                th:text="${rol}">
        </option>
    </select>
    <button type="submit">Guardar</button>
</form>
</body>
</html>
```

**Ejemplo 2: Enlazar Datos de un Formulario a un Objeto con `@ModelAttribute`**

Cuando un usuario envía un formulario, `@ModelAttribute` puede convertir los datos enviados en un **objeto Java** automáticamente.

**📌 Modelo `Usuario.java`**

```java
public class Usuario {
    private String nombre;
    private String rol;

    // Constructor vacío
    public Usuario() {}

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
```

------

**📌 Controlador**

```java
package com.bksexample.startproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bksexample.startproject.domain.Usuario;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/register")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "register";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("mensaje", "Usuario guardado con éxito: " + usuario.getNombre());
        return "resultado";
    }
}
```

**📌 Plantilla `register.html`**

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="/user/guardar" method="post" th:object="${usuario}">
    <label>Nombre:</label>
    <input type="text" th:field="*{nombre}" />

    <label>Rol:</label>
    <input type="text" th:field="*{rol}" />

    <button type="submit">Guardar</button>
</form>    
</body>
</html>
```

------

> [!IMPORTANT]
>
> El `*` indica que la expresión se evalúa **relativa al objeto definido en `th:object`** del formulario.
>
> Thymeleaf lo interpreta internamente como:
>
> **usuario.getRol()**

**📌 Plantilla `resultado.html`**

```
<h2 th:text="${mensaje}"></h2>
```

🎯 **¿Cuándo Usar `@ModelAttribute`?**

1. **Para pasar datos comunes a todas las vistas** (por ejemplo, listas de opciones, configuración, datos compartidos).
2. **Para mapear automáticamente los datos de un formulario a un objeto** (evita escribir `request.getParameter("nombre")`).
3. **Para predefinir valores de un formulario antes de cargarlo** (como usuario por defecto o valores iniciales).

### 2.6.2 Map y HashMap

En **Spring Boot**, `Map` es una **interfaz de Java** que pertenece a `java.util` y se usa para almacenar pares **clave-valor**. Se utiliza en múltiples escenarios dentro de una aplicación Spring Boot, como la gestión de configuraciones, respuesta de controladores, inyección de dependencias, entre otros.

1️⃣**Declaración de un `Map`**

```java
import java.util.*;

Map<KeyType, ValueType> nombreDelMapa = new HashMap<>();
```

📍 **Ejemplo con tipos específicos:**

```java
Map<String, Integer> edades = new HashMap<>();
```

Aquí, las **claves** son `String` (nombres de personas) y los **valores** son `Integer` (edades).

2️⃣**Tipos de `Map` en Java**

Existen diferentes implementaciones de `Map` en Java:

| Tipo                      | Características                                              |
| ------------------------- | ------------------------------------------------------------ |
| `HashMap<K, V>`           | No mantiene orden de inserción, permite `null` en claves y valores. |
| `TreeMap<K, V>`           | Mantiene los elementos ordenados por clave (requiere `Comparable`). |
| `LinkedHashMap<K, V>`     | Mantiene el orden de inserción de los elementos.             |
| `ConcurrentHashMap<K, V>` | Similar a `HashMap` pero con soporte para concurrencia (hilos). |

3️⃣**Métodos Principales de `Map`**

| Método                   | Descripción                                                  |
| ------------------------ | ------------------------------------------------------------ |
| `put(K key, V value)`    | Agrega un par clave-valor o actualiza uno existente.         |
| `get(K key)`             | Obtiene el valor asociado a una clave.                       |
| `remove(K key)`          | Elimina un par clave-valor.                                  |
| `containsKey(K key)`     | Verifica si la clave existe en el mapa.                      |
| `containsValue(V value)` | Verifica si el valor existe en el mapa.                      |
| `size()`                 | Devuelve la cantidad de pares clave-valor.                   |
| `keySet()`               | Retorna un `Set` con todas las claves.                       |
| `values()`               | Retorna una colección con todos los valores.                 |
| `entrySet()`             | Retorna un `Set` de `Map.Entry<K,V>`, útil para recorrer el mapa. |

### 2.6.3 HashMap

`HashMap` es una estructura de datos en Java que implementa la interfaz `Map`. Representa un conjunto de pares clave-valor, donde cada clave está asociada a un valor. Esta estructura permite el almacenamiento y recuperación eficiente de datos mediante el uso de una función de dispersión (hashing).

**características clave de `HashMap`:**

1. **Pares clave-valor**: Los elementos en un `HashMap` se almacenan como pares clave-valor, donde cada clave es única dentro del mapa y está asociada a un solo valor.
2. **Eficiencia**: La búsqueda, inserción y eliminación de elementos en un `HashMap` se realizan en tiempo constante en promedio (O(1)), siempre y cuando la función de dispersión esté bien diseñada y haya pocos conflictos de hash.
3. **No ordenado**: A diferencia de algunas implementaciones de `Map` como `LinkedHashMap`, los elementos en un `HashMap` no tienen un orden específico. Es decir, no hay garantía sobre el orden en que se devolverán las claves o los valores al iterar sobre el mapa.
4. **Permite valores nulos**: `HashMap` puede contener pares clave-valor donde tanto la clave como el valor pueden ser `null`. Sin embargo, normalmente se evita usar `null` como clave debido a que no se puede distinguir entre una clave `null` y la ausencia de una clave en el mapa.
5. **No sincronizado**: La implementación estándar de `HashMap` en Java (la clase `java.util.HashMap`) no es sincronizada, lo que significa que no es segura para su uso en entornos con múltiples hilos concurrentes sin sincronización externa. Sin embargo, existe una versión sincronizada llamada `Hashtable` que puede ser utilizada en tales casos, aunque con un costo de rendimiento.

#### 2.6.3.1 Métodos clave de `HashMap`:

- `put(K key, V value)`: Agrega un par clave-valor.
- `get(Object key)`: Obtiene el valor asociado a la clave.
- `remove(Object key)`: Elimina una clave y su valor asociado.
- `containsKey(Object key)`: Verifica si existe una clave.
- `containsValue(Object value)`: Verifica si existe un valor.
- `size()`: Devuelve el número de elementos en el `HashMap`.

⌨**Clase HashmapController**

```java
package com.bksexample.startproject.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HasmapController {
    @GetMapping("/hashmap")
    public String home(Model model) {
        Map<String, Object> datos = new HashMap<>();
        
        datos.put("mensaje", "Bienvenido a Spring Boot con Thymeleaf");
        datos.put("nombre", "Johlver Jose Pardo");
        datos.put("profesion", "Ingeniero FullStack");
        
        // Agregamos algunos datos adicionales para demostrar el uso del Map
        datos.put("experiencia", 5);
        datos.put("tecnologias", new String[]{"Java", "Spring", "JavaScript", "Angular"});
        
        model.addAttribute("datos", datos);
        return "hashmap"; // Nombre de la vista Thymeleaf (hashmap.html)
    }
}
```

⌨**View hashmap.html**

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Perfil</title>
</head>
<body>
    <h1 th:text="${datos.mensaje}">Texto por defecto</h1>
    <h2 th:text="${datos.nombre}">Nombre por defecto</h2>
    <p th:text="${datos.profesion}">Profesión por defecto</p>
    
    <p>Años de experiencia: <span th:text="${datos.experiencia}"></span></p>
    
    <h3>Tecnologías:</h3>
    <ul>
        <li th:each="tech : ${datos.tecnologias}" th:text="${tech}"></li>
    </ul>
</body>
</html>
```

<img src="https://i.ibb.co/j95FzqDF/image.png" style="zoom:67%;" />

#### 2.6.3.2 @Restcontroller con `Map`

Esta sección esta enfocada en  la integración entre la anotación @RestController y Map. Para el caso para vamos a crear un nada controlador que nos permitirá realizar esa integración para casos prácticos de esta guía el controlador se denominará userController. en el cual definiremos un endpoint el cual nos permitirá visualizar información establecida en el map; a diferencia de los casos anteriores no se renderizara la información en una página web o view, el resultado será retornado en formato json.

**Controlador RestUserController**

```java
package com.bksexample.startproject.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {
    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeMessage() {
        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "¡Bienvenido al mundo del desarrollo backend!");
        response.put("autor", "Johlver Pardo");
        return response;
    }
}
```

> Ejecute el proyecto con el comando: ./mvnw spring-boot:run (Windows)

![](https://i.ibb.co/VYx32DPg/image.png)

**📌 Resumen**

- `Map` es una estructura clave-valor en **Java** que es ampliamente utilizada en **Spring Boot**.
- Se usa en **controladores** para devolver respuestas JSON.
- Permite inyectar configuraciones desde `application.properties`.
- Se emplea en **servicios** para almacenar datos dinámicos y procesar información.

#### 2.6.3.3 @RequestMapping

`@RequestMapping` es una anotación fundamental en Spring MVC (y también en Spring Boot) que se utiliza para mapear solicitudes HTTP a métodos específicos dentro de un controlador. Esta anotación es bastante versátil y puede ser utilizada para mapear una variedad de tipos de solicitudes HTTP (GET, POST, PUT, DELETE, etc.) a métodos en un controlador.

formas en que se puede usar `@RequestMapping`:

1. **Mapeo de URLs**: `@RequestMapping` permite mapear una URL específica a un método en un controlador. Por ejemplo, `@RequestMapping("/hello")` mapea la URL "/hello" a un método en el controlador.
2. **Mapeo de métodos HTTP**: `@RequestMapping` permite especificar el método HTTP al que responde un método en el controlador. Por ejemplo, `@RequestMapping(value="/hello", method=RequestMethod.GET)` indica que el método en el controlador responde únicamente a solicitudes GET.
3. **Múltiples URLs y métodos**: `@RequestMapping` permite mapear múltiples URLs y métodos HTTP al mismo método en el controlador. Por ejemplo, `@RequestMapping(value={"/hello", "/greetings"}, method={RequestMethod.GET, RequestMethod.POST})` mapea los métodos GET y POST a las URLs "/hello" y "/greetings".
4. **Parámetros de solicitud**: `@RequestMapping` también puede tener parámetros adicionales para especificar condiciones de solicitud más complejas, como parámetros de consulta, encabezados de solicitud, tipo de contenido, etc.

```java
package com.usingthymeleaf.thymeleaf_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class userController {
    
    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeMessage() {
        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "¡Bienvenido al mundo del desarrollo backend!");
        response.put("autor", "Tu Nombre");
        return response;
    }
}
```

![](https://i.ibb.co/tpKqKfTk/image.png)

### 2.6.4 ArrayList

**¿Qué es un ArrayList?**

Un `ArrayList` en Java es una implementación de la interfaz `List` del paquete `java.util`. Es una colección de objetos redimensionable que se puede utilizar para almacenar y manipular una lista ordenada de elementos. A diferencia de los arrays tradicionales de Java, que tienen un tamaño fijo, los `ArrayList` pueden crecer o reducirse dinámicamente según sea necesario.

**Características principales de ArrayList:**

- **Ordenado:** Los elementos se almacenan en un orden específico basado en el índice. Puede acceder a los elementos por su índice (posición).
- **Redimensionable:** Puede agregar o eliminar elementos del `ArrayList` en tiempo de ejecución. El `ArrayList` se agranda o reduce automáticamente para adaptarse al número de elementos.
- **Basado en arrays:** Internamente, un `ArrayList` utiliza un array para almacenar los elementos. Sin embargo, a diferencia de los arrays fijos, el `ArrayList` gestiona automáticamente el tamaño del array subyacente.

En el siguiente ejemplo se implementara un nuevo endpoint que retorne un listado de usuarios almacenados en un arrayList.

1. Edite la clase RestUserController y agregue el siguiente método.

   ```java
   @GetMapping("/list-details")
   public List<UsersAuth> listdetails(){
       UsersAuth user = new UsersAuth("Juan","Perez","jperez", "password123", "Admnin");
       UsersAuth userA = new UsersAuth("Camilo","Hernandez","chernandez", "password456", "User");
       UsersAuth userB = new UsersAuth("Martha","Estupiñan","mestupinan", "password789", "User");
       List<UsersAuth> lstUsers = new ArrayList<>();
       lstUsers.add(user);
       lstUsers.add(userA);
       lstUsers.add(userB);
       return lstUsers;
       }
   ```

   <img src="https://i.ibb.co/35mNw9yg/image.png" style="zoom:67%;" />

### 2.6.5 Models

En las aplicaciones Spring Boot que siguen el patrón de diseño Modelo-Vista-Controlador (MVC), el Modelo sirve como contenedor para los datos que necesitan ser pasados entre el Controlador y la Vista. Actúa como un puente, permitiendo al Controlador compartir información con la Vista para su presentación.

Para esta guía se creara un modelo que represente los datos de un usuario.

1. Cree un nuevo paquete llamado models. El paquete debe depender el paquete principal del proyecto.

1. Cree una nueva clase en el paquete models y llamela User

   ```java
   package com.bksexample.startproject.domain.models;
   
   public class User {
       private String name;
       private String lastName;
   }
   ```

#### 2.6.5.1 Getters (métodos de acceso):

   - Los getters son métodos públicos que **devuelven el valor** de una variable privada de la clase.
   - Su nombre suele empezar por `get` seguido del nombre de la variable con la primera letra en mayúscula (por ejemplo, `getName()` para una variable privada `name`).
   - No toman ningún parámetro (argumentos).

**Setters (métodos modificadores):**

   - Los setters son métodos públicos que **establecen o actualizan el valor** de una variable privada de la clase.
   - Su nombre suele empezar por `set` seguido del nombre de la variable con la primera letra en mayúscula (por ejemplo, `setName()` para una variable privada `name`).
   - Toman un parámetro del mismo tipo de dato que la variable privada.

**Ventajas de usar getters y setters:**

- **Encapsulación:** Al mantener las variables privadas y proporcionar acceso controlado a través de getters y setters, se protege el estado interno de la clase de modificaciones no deseadas.

  - **Validación:** Se pueden incluir validaciones dentro de los setters para garantizar que solo se asignen valores válidos a las variables. Por ejemplo, un setter para una edad podría comprobar que el valor sea positivo.
  - **Mayor flexibilidad:** Los getters y setters pueden personalizarse para realizar tareas adicionales, como el registro de cambios o la notificación a otras partes del código cuando se modifica una variable.

  Para agregar los métodos haga clic derecho en un espacio vacio dentro de la clase y seleccione la opción Source Action

  <img src="https://i.ibb.co/LhSSXvZQ/image.png" style="zoom:67%;" />

  en el asistente de creacion de los metodos seleccione los atributos a los se les va a crear los get y set.

  ![](https://i.ibb.co/v6ZWvxYk/image.png)

  Como resultado la clase User quedara de asi:

  <img src="https://i.ibb.co/VcDJjJ0P/image.png" style="zoom:67%;" />

```java
package com.bksexample.startproject.domain.models;

public class User {
    private String name;
    private String lastName;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
```

#### 2.6.5.2 Constructor de la clase

En programación orientada a objetos, un constructor es un método especial que se utiliza para **inicializar** un objeto recién creado. Se llama automáticamente **cuando se crea una instancia de una clase**.

**Características clave de los constructores:**

- **Nombre:** El nombre del constructor **debe ser el mismo que el nombre de la clase**.

- **Tipo de retorno:** Los constructores **no tienen tipo de retorno**. Esto se debe a que su función principal es inicializar el objeto, no devolver ningún valor.

- **Parámetros:** Los constructores pueden tener **parámetros** para recibir valores iniciales para las variables de instancia del objeto. Esto permite personalizar la creación del objeto con diferentes configuraciones.

- Inicialización:

  Dentro del constructor, se 

  asigna valores a las variables de instancia

   del objeto. Esto puede implicar:

  - Asignar valores predeterminados.
  - Validar los valores proporcionados como parámetros.
  - Realizar otras tareas de inicialización necesarias para que el objeto esté listo para su uso.

**Tipos de constructores:**

- **Constructor por defecto:** Un constructor **sin parámetros** que se invoca cuando no se proporcionan valores explícitos al crear un objeto. Asigna valores predeterminados a las variables de instancia.
- **Constructor con parámetros:** Un constructor que **recibe parámetros** para inicializar las variables de instancia con valores específicos proporcionados por el usuario.

Para crear el constructor de la clase haga clic derecho en un espacio vacío de la clase y en el menu contextual seleccione la opcion Source Action

<img src="https://i.ibb.co/P22sYw7/image.png" style="zoom: 67%;" />

Seleccione los atributos que desea pasar por parámetro en el constructor.

![](https://i.ibb.co/hxg4xjPJ/image.png)

Como resultado del proceso obtendremos el constructor en la clase:

```java
package com.bksexample.startproject.domain.models;

public class User {
    private String name;
    private String lastName;
    
    public User() {
    }
    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
```

Ajustando el controlador.....

```java
package com.bksexample.startproject.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bksexample.startproject.domain.models.User;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeMessage() {
        User user = new User("Johlver","Pardo");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("user", user);
        return body;
    }
}
```

**Utilizando Model Modificando en la vista renderizada.**

```java
package com.bksexample.startproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bksexample.startproject.domain.models.User;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        User user = new User("Johlver","Pardo");
        model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
        model.addAttribute("user", user);
        return "index";
    }
}
```

**Modificando template view (index.html)**

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title th:text="${title}">Document</title>
</head>
<body>
    <h1 th:text="${user.name}"></h1>
    <h2 th:text="${user.lastName}"></h2>
</body>
</html>
```

## 2.7 Directivas

Las directivas en Thymeleaf son atributos especiales en las etiquetas HTML que permiten manipular contenido de manera dinámica.

### 2.7.1`th:text`  

**Modifica el contenido de un elemento**

Este atributo reemplaza el contenido del elemento HTML con el valor proporcionado en la expresión.

🔹 **Ejemplo**: Mostrar el nombre de un usuario

📌 **Código Thymeleaf**

```
<p th:text="${usuario.nombre}">Nombre por defecto</p>
```

📌 **Controlador Spring Boot**

```java
@Controller
public class UsuarioController {
    @GetMapping("/usuario")
    public String usuario(Model model) {
        model.addAttribute("usuario", new Usuario("Javier"));
        return "usuario";
    }
}
```

📌 **Salida HTML Generada**

```java
<p>Javier</p>
```

------

### 2.7.2`th:utext` 

**Renderiza contenido HTML dentro de la plantilla**

A diferencia de `th:text`, este permite interpretar contenido HTML.

🔹 **Ejemplo**: Mostrar texto en negrita usando HTML

📌 **Código Thymeleaf**

```java
<p th:utext="${mensaje}"></p>
```

📌 **Controlador Spring Boot**

```java
@Controller
public class MensajeController {
    @GetMapping("/mensaje")
    public String mensaje(Model model) {
        model.addAttribute("mensaje", "<strong>¡Bienvenido a nuestra página!</strong>");
        return "mensaje";
    }
}
```

📌 **Salida HTML Generada**

```java
<p><strong>¡Bienvenido a nuestra página!</strong></p>
```

------

### 2.7.3`th:if` y `th:unless` 

**Condicionales en Thymeleaf**

Estos atributos permiten renderizar elementos HTML de acuerdo a una condición.

🔹 **Ejemplo**: Mostrar mensaje según si el usuario está autenticado

📌 **Código Thymeleaf**

```java
<p th:if="${usuario != null}">Bienvenido, <span th:text="${usuario.nombre}"></span></p>
<p th:unless="${usuario != null}">Por favor, inicia sesión.</p>
```

📌 **Controlador Spring Boot**

```java
@Controller
public class LoginController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("usuario", null); // Usuario no autenticado
        return "home";
    }
}
```

📌 **Salida HTML Generada**

```
<p>Por favor, inicia sesión.</p>
```

------

### 2.7.5`th:each` 

**Iterar sobre listas**

Este atributo permite recorrer listas o colecciones de objetos.

🔹 **Ejemplo**: Mostrar una lista de productos

📌 **Código Thymeleaf**

```java
<ul>
    <li th:each="producto : ${productos}">
        <span th:text="${producto.nombre}"></span> - $<span th:text="${producto.precio}"></span>
    </li>
</ul>
```

📌 **Controlador Spring Boot**

```java
@Controller
public class ProductoController {
    @GetMapping("/productos")
    public String productos(Model model) {
        List<Producto> lista = Arrays.asList(
            new Producto("Laptop", 1200),
            new Producto("Mouse", 50),
            new Producto("Teclado", 80)
        );
        model.addAttribute("productos", lista);
        return "productos";
    }
}
```

📌 **Salida HTML Generada**

```
<ul>
    <li>Laptop - $1200</li>
    <li>Mouse - $50</li>
    <li>Teclado - $80</li>
</ul>
```

------

### 2.7.5`th:href` y `th:src` 

**Manipulación de enlaces e imágenes**

Estos atributos permiten asignar dinámicamente URLs y rutas a imágenes.

🔹 **Ejemplo**: Enlace dinámico y carga de imagen

📌 **Código Thymeleaf**

```java
<a th:href="@{/perfil/{id}(id=${usuario.id})}">Ver Perfil</a>
<img th:src="@{/images/avatar.png}" alt="Avatar">
```

📌 **Salida HTML Generada**

```java
<a href="/perfil/5">Ver Perfil</a>
<img src="/images/avatar.png" alt="Avatar">
```

------

### 2.7.6`th:value` 

**Asignar valores en formularios**

Se usa para establecer valores en los inputs.

🔹 **Ejemplo**: Formulario con datos precargados

📌 **Código Thymeleaf**

```
htmlCopiarEditar<form>
    <input type="text" th:value="${usuario.nombre}" />
</form>
```

📌 **Salida HTML Generada**

```
htmlCopiarEditar<form>
    <input type="text" value="Carlos" />
</form>
```

------

### 2.7.7`th:switch` y `th:case` 

**Estructura `switch` en Thymeleaf**

Estos atributos permiten evaluar un valor y ejecutar diferentes opciones.

🔹 **Ejemplo**: Mostrar diferentes mensajes según el rol del usuario

📌 **Código Thymeleaf**

```
<div th:switch="${usuario.rol}">
    <p th:case="'admin'">Eres un administrador.</p>
    <p th:case="'usuario'">Eres un usuario registrado.</p>
    <p th:case="*">Rol desconocido.</p>
</div>
```

📌 **Salida HTML Generada** (si el usuario es admin)

```
<p>Eres un administrador.</p>
```

------

### 2.7.8.`th:replace` y `th:include` 

**Fragmentos reutilizables**

Permiten reutilizar partes de código HTML.

🔹 **Ejemplo**: Incluir un fragmento de cabecera

📌 **Fragmento `header.html`**

```java
<header th:fragment="cabecera">
    <h1>Mi Aplicación</h1>
</header>
```

📌 **Código Thymeleaf**

```java
<div th:replace="fragments/header :: cabecera"></div>
```

📌 **Salida HTML Generada**

```java
<header>
    <h1>Mi Aplicación</h1>
</header>
```

------

### 2.7.9.`th:classappend` y `th:styleappend` 

**Clases y estilos dinámicos**

Estos atributos permiten agregar clases o estilos dinámicamente.

🔹 **Ejemplo**: Resaltar usuarios activos con clases CSS

📌 **Código Thymeleaf**

```
<p th:classappend="${usuario.activo} ? 'text-success' : 'text-danger'">
    <span th:text="${usuario.nombre}"></span>
</p>
```

📌 **Salida HTML Generada** (si el usuario está activo)

```
<p class="text-success">Carlos</p>
```

## 2.8 Taller practico usando each y @ModelAttribute

1 Agregue el atributo email a la clase user que se encuentra en el paquete model.

```java
package com.usingthymeleaf.thymeleaf_app.models;

public class User {
    private String name;
    private String lastName;
    private String email;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
```

2. En el controlador **indexController** agregue el metodo **usersModel** y el endpoint **list**

```java
package com.usingthymeleaf.thymeleaf_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.usingthymeleaf.thymeleaf_app.models.User;

@Controller
public class indexController {
    @GetMapping("/")
    public String home(Model model) {
        User user = new User("Johlver","Pardo");
        model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
        model.addAttribute("user", user);
        return "index";
    }
    @GetMapping("/list")
    public String list(ModelMap model){

        model.addAttribute("title", "Listado de Usuarios");
        return "list";
    }
    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
            new User("Pepa", "Gonzalez"),
            new User("Lalo", "Perez", "lalo@correo.com"),
            new User("Juanita", "Roe", "juana@correo.com"),
            new User("Andres", "Doe")
        );
        return users;
    }
}

```

3. Cree un nuevo documento html en templates y llamelo list.html y agregue el siguiente codigo

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title th:text="${title}">Document</title>
</head>
<body>
    <h1 th:text="${title}"></h1>
    <div th:if="${users.isEmpty()}">No se encontro ningun registro....</div>
    <table th:if="${not (users.isEmpty())}">
        <thead>
            <tr>
                <th>Nombre de usuario</th>
                <th>Apellidos de usuario</th>
                <th>Correo electronico</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user: ${users}">
                <td th:text="${user.name}"></td>
                <td th:text="${user.lastName}"></td>
                <td th:if="${user.email}" th:text="${user.email}"></td>
                <td th:if="${not (user.email != null)}" th:text="${'Email no disponible'}"></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
```

# 3. SpringBoot Intermedio

## 3.1 Modificar el puerto por defecto

Cuando ejecutamos una aplicación Spring Boot, por defecto, el servidor embebido (Tomcat, Jetty o Undertow) se inicia en el puerto **8080**. Sin embargo, en muchos casos es necesario cambiar este puerto para evitar conflictos con otras aplicaciones, ajustarlo a los estándares de un entorno de despliegue o cumplir con requisitos específicos del sistema.

Spring Boot ofrece múltiples formas de modificar el puerto del servidor, ya sea mediante archivos de configuración (`application.properties` o `application.yml`), argumentos de línea de comandos o configuración programática. Este capítulo explorará cada una de estas opciones, proporcionando ejemplos prácticos para personalizar el puerto de tu aplicación de manera sencilla y efectiva.

Al finalizar este capítulo, serás capaz de:

- Cambiar el puerto del servidor usando **propiedades de configuración**.
- Modificar el puerto a través de **variables de entorno o argumentos de línea de comandos**.
- Configurar el puerto mediante **código Java** en una clase de configuración.

1️⃣ Cambiar el puerto en `application.properties` o `application.yml`

La forma más sencilla y recomendada para modificar el puerto del servidor en Spring Boot es configurarlo en los archivos de propiedades o YAML.

🔹 Usando `application.properties`

En el archivo `src/main/resources/application.properties`, agrega la siguiente línea:

```
server.port=9090
```

Esto hará que la aplicación se inicie en el puerto **9090** en lugar del puerto predeterminado **8080**.

🔹 Usando `application.yml`

Si prefieres usar YAML, agrega la siguiente configuración en `src/main/resources/application.yml`:

```
server:
  port: 9090
```

Ambas opciones lograrán el mismo resultado y se recomienda utilizar este método porque es simple, claro y fácil de mantener.

------

2️⃣ Cambiar el puerto con argumentos de línea de comandos

Si necesitas cambiar el puerto de forma dinámica sin modificar el código fuente, puedes hacerlo al ejecutar la aplicación con un argumento en la línea de comandos.

Ejecuta tu aplicación con:

```
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=9090
```

O si ejecutas el JAR directamente:

```
java -jar mi-aplicacion.jar --server.port=9090
```

Este método es útil cuando despliegas tu aplicación en diferentes entornos y necesitas definir el puerto en tiempo de ejecución.

------

3️⃣ Cambiar el puerto con variables de entorno

Otra alternativa flexible es usar variables de entorno. En Linux y macOS, puedes establecer la variable antes de ejecutar la aplicación:

```
export SERVER_PORT=9090
mvn spring-boot:run
```

En Windows (cmd):

```
set SERVER_PORT=9090
mvn spring-boot:run
```

O si usas PowerShell:

```
$env:SERVER_PORT=9090
mvn spring-boot:run
```

Este método es útil cuando trabajas en **contenedores Docker** o despliegues en la nube.

------

4️⃣ Cambiar el puerto de forma programática en una clase de configuración

Si necesitas un mayor control sobre la configuración del puerto, puedes definirlo en una **clase Java** dentro del código de la aplicación.

```java
public static void main(String[] args) {
    SpringApplication app = new SpringApplication(
        BetplayAppApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
    app.run(args);
    //SpringApplication.run(BetplayAppApplication.class, args);
}

@Bean
WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @SuppressWarnings("null")
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins("http://localhost:4200","http://localhost",
            "http://localhost:8080").allowedMethods("*").allowedHeaders("*");
        }
    };
}
```

https://gist.github.com/21faa9fb918ececaa7e3e4d9a816975d.git

## 3.2 DTO

En el desarrollo de aplicaciones con **Spring Boot**, es fundamental mantener una separación clara entre la lógica de negocio y la exposición de datos. **DTO (Data Transfer Object)** es un patrón de diseño que nos permite lograr esta separación al actuar como una capa intermedia entre la entidad de base de datos y la respuesta que se envía al cliente.

Los **DTOs** se utilizan principalmente para:

✅ **Evitar exponer directamente las entidades del modelo de datos** en las respuestas de la API.
✅ **Reducir el tamaño de la carga de datos** en las respuestas, incluyendo solo la información necesaria.
✅ **Validar y transformar datos** antes de enviarlos al cliente o antes de guardarlos en la base de datos.
✅ **Asegurar el cumplimiento de principios SOLID**, específicamente el principio de **Responsabilidad Única (SRP)**.

En este capítulo, exploraremos cómo implementar DTOs en Spring Boot, abordando:

1️⃣ **Cómo definir un DTO** y cuándo utilizarlo.
2️⃣ **Cómo mapear entidades a DTOs** con herramientas como `ModelMapper` o `MapStruct`.
3️⃣ **Cómo integrar DTOs en controladores y servicios**.
4️⃣ **Buenas prácticas** en el uso de DTOs para garantizar un código limpio y mantenible.

Los DTO (**Objetos de Transferencia de Datos** por sus siglas en español) son un patrón de diseño común en programación utilizado para transferir datos entre diferentes capas de una aplicación. Son especialmente útiles en arquitecturas como la de Capas (Layered Architecture) o la arquitectura Limpia (Clean Architecture).

**Ejercicio:** Usando DTO exponer de la clase User la propiedad name y lastName.

1. Se crea un nuevo paquete llamado Dtos en el paquete Models. El identificador de la clase se recomieda agregarle las iniciales Dto al final del identificador de la clas ej. userDto.

   ![](https://i.ibb.co/ccGtgvt2/image.png)

2. Defina las propiedades que desea exponer con el Dto; genere los metodos getter y setter. Para el ejemplo se va a exponer una propiedad llamada titulo y la clase user(name,lastName y email)

   ```java
   package com.bksexample.startproject.domain.models.dtos;
   
   import com.bksexample.startproject.domain.models.User;
   
   public class UserDto {
       private String title;
       private User user;
       public String getTitle() {
           return title;
       }
       public void setTitle(String title) {
           this.title = title;
       }
       public User getUser() {
           return user;
       }
       public void setUser(User user) {
           this.user = user;
       }
       
   }
   
   ```

3. Agregue el siguiente fragmento de codigo al controlador llamado userController.

   ```java
   @GetMapping("/veruser")
   public UserDto geUserDto() {
       UserDto userDto = new UserDto();
       User user = new User("Johlver","Pardo","jjpardo@gmail.com");
       userDto.setTitle("Usuario registrado");
       userDto.setUser(user);
       return userDto;
   } 
   ```

4. Ejecute el proyecto haciendo uso del **Dashboard** de Spring desde Visual Studio Code.

   ![](https://i.ibb.co/Vfb46R4/image.png)

## 3.3 RequestParam

La anotación `@RequestParam` en Spring MVC se utiliza para extraer parámetros de la solicitud HTTP y vincularlos a los parámetros de un método en un controlador. Específicamente, permite acceder a los parámetros de la cadena de consulta, los datos del formulario y otras partes de la solicitud.

   Usos y Beneficios de `@RequestParam`

   > [!IMPORTANT]
   >
   > 📌 ¿Qué es la cadena de consulta?
   >
   > Es la parte de la URL que aparece después del signo `?` y se compone de pares `clave=valor`
   >
   > **Ejemplo de URL:**
   >
   > ```
   > /usuarios/buscar?nombre=Juan&edad=30
   > ```

####    Uso básico de `@RequestParam`

   ```java
   @GetMapping("/buscar")
   public String buscarUsuario(
           @RequestParam String nombre,
           @RequestParam int edad,
           Model model) {
   
       model.addAttribute("nombre", nombre);
       model.addAttribute("edad", edad);
       return "resultado";
   }
   ```

   ✔ Spring toma automáticamente:

   - `nombre=Juan`
   - `edad=30`

#### `@RequestParam` con nombre explícito

   Útil cuando el nombre del parámetro en la URL **no coincide** con el nombre del parámetro Java

```java
@GetMapping("/buscar")
public String buscar(
        @RequestParam("q") String termino) {
    return "resultado";
}
```

```html
/buscar?q=spring
```

#### Parámetros opcionales

Opción 1: `required = false`

```java
@GetMapping("/buscar")
public String buscar(
        @RequestParam(required = false) String nombre) {
    return "resultado";
}
```

> [!WARNING]
>
> Si no se envía `nombre`, su valor será `null`.

Opción 2: `defaultValue`

```java
@GetMapping("/buscar")
public String buscar(
        @RequestParam(defaultValue = "Invitado") String nombre) {
    return "resultado";
}
```

> [!WARNING]
>
> Si no se envía el parámetro, Spring asigna `"Invitado"`.

#### Múltiples valores para un mismo parámetro

```java
@GetMapping("/filtro")
public String filtrar(
        @RequestParam List<String> rol) {
    return "resultado";
}
```

```
/filtro?rol=ADMIN&rol=USUARIO
```

#### Ejemplo Formulario HTML

📌 Escenario típico

Un formulario HTML envía datos por **GET**, estos viajan en la **query string**, Spring los recibe con `@RequestParam` y Thymeleaf muestra los resultados.

🧩 Formulario Thymeleaf (envío por GET)

```html
<form th:action="@{/usuarios/buscar}" method="get">
    <input type="text" name="nombre" placeholder="Nombre" />
    <select name="rol">
        <option value="">-- Rol --</option>
        <option value="ADMIN">ADMIN</option>
        <option value="USUARIO">USUARIO</option>
    </select>
    <button type="submit">Buscar</button>
</form>

```

> [!CAUTION]
>
> Clave importante:
> Cuando se usa @RequestParam, NO se usa th:field, solo name.

🧩 2. Controlador con `@RequestParam`

```java
@GetMapping("/usuarios/buscar")
public String buscarUsuarios(
        @RequestParam(required = false) String nombre,
        @RequestParam(required = false) String rol,
        Model model) {

    model.addAttribute("nombre", nombre);
    model.addAttribute("rol", rol);

    return "resultado";
}
```

✔ Recibe los valores enviados por la URL
 ✔ Permite parámetros opcionales
 ✔ No necesita `@ModelAttribute`

🧩 3. Mostrar valores recibidos en Thymeleaf

```java
<p th:if="${nombre}">
    Nombre buscado: <span th:text="${nombre}"></span>
</p>

<p th:if="${rol}">
    Rol seleccionado: <span th:text="${rol}"></span>
</p>
```

🔁 4. Mantener valores del formulario (UX)

```html
<input type="text" name="nombre" th:value="${nombre}" />

<select name="rol">
    <option value="">-- Rol --</option>
    <option value="ADMIN" th:selected="${rol == 'ADMIN'}">ADMIN</option>
    <option value="USUARIO" th:selected="${rol == 'USUARIO'}">USUARIO</option>
</select>
```

⚠️ Error común (muy importante)

❌ **Esto es incorrecto con `@RequestParam`:**

```
<input th:field="*{nombre}" />
```

✔ Eso solo se usa con `@ModelAttribute`.

#### Ejemplo de paginación usando RequestParam

La paginación con **`@RequestParam`** es el enfoque estándar para **listas, búsquedas y filtros**, ya que mantiene el estado en la **URL** (page, size, sort, filtros).

##### 📌 Objetivo

Listar resultados paginados usando:

- `page` → número de página (base 0 o 1)
- `size` → cantidad de registros por página
- Filtros opcionales (`@RequestParam`)
- Navegación con Thymeleaf

1️⃣ Clase dominio `Usuario`

```java
public class Usuario {

    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
}
```

2️⃣ Controlador con `@RequestParam` + paginación

```java
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
    private final List<Usuario> usuarios = List.of(
        new Usuario("Ana", "ADMIN"),
        new Usuario("Luis", "USUARIO"),
        new Usuario("Juan", "ADMIN"),
        new Usuario("Carlos", "INVITADO"),
        new Usuario("María", "USUARIO"),
        new Usuario("Pedro", "ADMIN"),
        new Usuario("Laura", "USUARIO")
    );

    @GetMapping
    public String listarUsuarios(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            Model model) {

        int start = page * size;
        int end = Math.min(start + size, usuarios.size());

        List<Usuario> usuariosPagina = usuarios.subList(start, end);

        int totalPages = (int) Math.ceil((double) usuarios.size() / size);

        model.addAttribute("usuarios", usuariosPagina);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        return "usuarios";
    }
}
```

📌 **Notas importantes**

- `page` empieza en **0**
- `size` define cuántos registros se muestran
- Todo se controla desde la URL

3️⃣ Vista Thymeleaf `usuarios.html`

```java
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Nombre</th>
        <th>Rol</th>
    </tr>
    <tr th:each="u : ${usuarios}">
        <td th:text="${u.nombre}"></td>
        <td th:text="${u.rol}"></td>
    </tr>
</table>
<div>

    <a th:if="${currentPage > 0}"
    th:href="@{/usuarios(
            page=${currentPage - 1},
            size=${param.size}
    )}">
        Anterior
    </a>

    <span>
        Página <span th:text="${currentPage + 1}"></span>
        de <span th:text="${totalPages}"></span>
    </span>

    <a th:if="${currentPage + 1 < totalPages}"
    th:href="@{/usuarios(
            page=${currentPage + 1},
            size=${param.size}
    )}">
        Siguiente
    </a>
<ul>
    <li th:each="i : ${#numbers.sequence(0, totalPages - 1)}">
        <a th:href="@{/usuarios(page=${i})}"
           th:text="${i + 1}"></a>
    </li>
</ul>
</div>
</body>
</html>
```

4️⃣ Controles de paginación

```html
<div>

    <a th:if="${currentPage > 0}"
       th:href="@{/usuarios(page=${currentPage - 1})}">
        Anterior
    </a>

    <span>
        Página <span th:text="${currentPage + 1}"></span>
        de <span th:text="${totalPages}"></span>
    </span>

    <a th:if="${currentPage + 1 < totalPages}"
       th:href="@{/usuarios(page=${currentPage + 1})}">
        Siguiente
    </a>

</div>
```

5️⃣ Navegación por números

```html
<ul>
    <li th:each="i : ${#numbers.sequence(0, totalPages - 1)}">
        <a th:href="@{/usuarios(page=${i})}"
           th:text="${i + 1}"></a>
    </li>
</ul>
```

## 3.4 @PathVariable

En Spring Boot, @PathVariable es una anotación utilizada para vincular valores de URL con métodos manejadores dentro de un controlador. La anotación ofrece una forma directa de vincular los parámetros de un método dentro de un controlador con una parte de la URL. La anotación se puede usar para pasar valores dinámicos en la URL a los métodos de los controladores.

#### Ejemplo

```java
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}

```

En este ejemplo:

- La URL `http://localhost:8080/greeting/{name}` puede ser accedida con diferentes valores en lugar de `{name}`, como `http://localhost:8080/greeting/John`.
- El valor `{name}` en la URL se extrae y se pasa como parámetro al método `greeting`.

Si se requiere especificar el nombre del parámetro en el método y en la URL de manera explícita, puedes hacerlo de la siguiente manera:

```java
org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting/{userName}")
    public String greeting(@PathVariable("userName") String name) {
        return "Hello, " + name + "!";
    }
}
```

#### Ejemplo

Cree el Siguiente DTO

```java
public class ParamsDto {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
```

Cree una nueva clase en el paquete controller. La clase se llamara PathVariableController. Agregue las anotaciones @ResController y @RequesMapping.

```java
@RestController
@RequestMapping
public class PathVariableController {

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
}
```

##### Explicación:

- `@RestController`: combina `@Controller` y `@ResponseBody`, lo cual permite devolver objetos directamente como JSON.
- `@RequestMapping`: establece la raíz para las rutas. En este caso, se deja vacía, pero podrías ajustarla a `"/api"` u otro prefijo si lo deseas.
- `@GetMapping("/saludo/{message}")`: define el endpoint que espera un parámetro en la URL.
- `@PathVariable`: enlaza el valor de la URL al parámetro del método.
- `ParamsDto`: clase DTO donde se setea el valor recibido.

Uso

> [!TIP]
>
> http://localhost:8080/saludo/HolaMundo

#### 3.4.1 Uso de múltiples variables con `@PathVariable` en Spring Boot

La clase `PathVariableController` expone un endpoint REST que permite recibir múltiples valores directamente desde la URL utilizando la anotación `@PathVariable`. Este mecanismo es útil para construir rutas semánticas y legibles en servicios REST.

##### ✅ Definición del endpoint

Se define un método mapeado a la ruta:

```
GET /saludo/{nombre}/{edad}
```

Este método recibe dos parámetros: `nombre` (de tipo `String`) y `edad` (de tipo `int`), los cuales son extraídos directamente desde la URL.

##### ✅ Implementación del controlador

```java
package com.example.demo.controller;

import com.example.demo.dto.ParamsDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PathVariableController {

    @GetMapping("/saludo/{nombre}/{edad}")
    public ParamsDto saludo(@PathVariable String nombre, @PathVariable int edad) {
        ParamsDto param = new ParamsDto();
        param.setMessage("Hola " + nombre + ", tienes " + edad + " años.");
        return param;
    }
}
```

##### ✅ Clase DTO utilizada

La clase `ParamsDto` se encarga de encapsular el mensaje de respuesta que será devuelto como JSON:

```java
package com.example.demo.dto;

public class ParamsDto {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
```

##### 🔎 Ejemplo de uso

Una solicitud `GET` a la siguiente URL:

```
http://localhost:8080/saludo/Ana/30
```

Generará la siguiente respuesta JSON:

```
{
  "message": "Hola Ana, tienes 30 años."
}
```

------

##### 💡 Consideraciones

- La anotación `@PathVariable` permite mapear segmentos de la URL a parámetros del método.
- Spring se encarga automáticamente de la conversión de tipos básicos como `String`, `int`, `long`, etc.
- Es importante que los nombres definidos en la ruta (`{nombre}`, `{edad}`) coincidan exactamente con los nombres de los parámetros anotados, o se debe especificar `@PathVariable("nombreVariable")` explícitamente.

#### 3.4.2 Enviar Json usando Post

En el desarrollo de aplicaciones web modernas, es común que los clientes (como frontends en JavaScript, móviles o herramientas como Postman) envíen datos al servidor en **formato JSON**. En aplicaciones construidas con **Spring Boot**, este tipo de comunicación se maneja fácilmente utilizando anotaciones como `@PostMapping` y `@RequestBody`.

🎯 **¿Qué es una solicitud POST con JSON?**

- Es una solicitud HTTP donde se envían datos en el cuerpo del mensaje (body) en formato JSON.
- Es comúnmente utilizada para crear o modificar recursos en el servidor (por ejemplo: registrar usuarios, guardar formularios, etc.).
- A diferencia del método GET, en POST los datos **no viajan en la URL**, sino en el cuerpo de la petición.

------

✅ **¿Cómo lo maneja Spring Boot?**

Spring Boot ofrece soporte automático para trabajar con JSON gracias a la librería **Jackson**, incluida en el `spring-boot-starter-web`.

Para que un controlador pueda recibir JSON:

- Se define una clase DTO (objeto de transferencia de datos) que represente la estructura del JSON.
- Se crea un método con la anotación `@PostMapping`.
- Se usa `@RequestBody` para que Spring convierta automáticamente el JSON recibido en una instancia del DTO.

##### Ejemplo

**DTO**

```java
public class ParamsDto {
    private String message;

    public ParamsDto() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
```

**PathVariableController**

```java
@RestController
@RequestMapping
public class PathVariableController {

    @PostMapping("/saludo")
    public ParamsDto saludoPost(@RequestBody ParamsDto param) {
        // Aquí se podría procesar la información recibida
        param.setMessage("Recibido: " + param.getMessage());
        return param;
    }
}
```

#### 🛠️ Taller: Recepción de JSON con Validaciones y Objetos Anidados en Spring Boot

##### 🎯 Objetivo del taller

En este taller, se guía al desarrollador en la construcción de un endpoint REST en Spring Boot que reciba datos en formato JSON mediante una solicitud `POST`. El JSON contendrá campos simples y un objeto anidado, y todos los datos serán validados utilizando la especificación Bean Validation (`jakarta.validation`). El resultado final será una API robusta que responde con mensajes adecuados en caso de errores de validación.

------

##### 🧩 Estructura esperada del JSON de entrada

```java
{
  "nombre": "Juan",
  "email": "juan@example.com",
  "edad": 25,
  "direccion": {
    "calle": "Av. Principal",
    "ciudad": "Lima",
    "codigoPostal": "15000"
  }
}
```

------

##### 🧰 Requisitos previos

- Tener un proyecto Spring Boot generado (por ejemplo, desde https://start.spring.io).
- Haber incluido la dependencia `spring-boot-starter-web`.
- Estar utilizando Java 17 o superior.
- IDE recomendado: IntelliJ IDEA, VSCode o Spring Tool Suite.

------

##### 🪜 Paso 1: Crear el DTO para la dirección (`DireccionDto`)

Se define una clase `DireccionDto` que representa un objeto anidado dentro del JSON. Incluye validaciones para que los campos no se encuentren vacíos y que el código postal cumpla una longitud exacta de 5 caracteres.

```java
package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DireccionDto {

    @NotBlank(message = "La calle es obligatoria")
    private String calle;

    @NotBlank(message = "La ciudad es obligatoria")
    private String ciudad;

    @Size(min = 5, max = 5, message = "El código postal debe tener 5 caracteres")
    private String codigoPostal;

    // Getters y Setters
}
```

------

##### 🪜 Paso 2: Crear el DTO principal (`UsuarioDto`)

El DTO principal representa al usuario y contiene los campos básicos, además del objeto anidado `direccion`. Se utilizan anotaciones como `@NotBlank`, `@Email`, `@Min` y `@Max` para aplicar validaciones automáticas.

```java
package com.example.demo.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class UsuarioDto {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "El correo electrónico no es válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @Min(value = 18, message = "La edad mínima es 18")
    @Max(value = 99, message = "La edad máxima es 99")
    private int edad;

    @Valid
    private DireccionDto direccion;

    // Getters y Setters
}
```

> La anotación `@Valid` en el campo `direccion` es fundamental para que las validaciones dentro del objeto anidado sean evaluadas.

------

##### 🪜 Paso 3: Crear el controlador REST (`UsuarioController`)

En este paso, se define el controlador que maneja las solicitudes `POST` al endpoint `/usuario`. El cuerpo del JSON es recibido mediante `@RequestBody` y validado automáticamente con `@Valid`.

```java
package com.example.demo.controller;

import com.example.demo.dto.UsuarioDto;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @PostMapping
    public UsuarioDto crearUsuario(@Valid @RequestBody UsuarioDto usuario) {
        // Aquí podría guardarse el usuario en la base de datos
        return usuario; // Se devuelve como respuesta de prueba
    }
}
```

------

##### 💻 En **Postman**

1. **Abrir Postman**.

2. Seleccionar método `POST`.

3. En la barra de URL, escribir:

   ```
   http://localhost:8080/usuario
   ```

4. Ir a la pestaña **Body**.

5. Elegir la opción **raw**.

6. Seleccionar el tipo `JSON` en el selector que dice `Text`.

7. Pegar el JSON en el área de texto.

8. Presionar **Send**.

🔁 Si todo es correcto, obtendrá una respuesta con los mismos datos enviados:

```json
{
  "nombre": "Laura",
  "email": "laura@example.com",
  "edad": 30,
  "direccion": {
    "calle": "Av. Central",
    "ciudad": "Quito",
    "codigoPostal": "17010"
  }
}
```

##### 💻 En **Insomnia**

1. Abrir **Insomnia**.

2. Crear una nueva petición.

3. Seleccionar método `POST`.

4. En la URL, escribir:

   ```
   http://localhost:8080/usuario
   ```

5. Ir a la pestaña **Body**.

6. Elegir la opción **JSON**.

7. Pegar el mismo contenido del JSON anterior.

8. Hacer clic en **Send**.

## 3.5 @Value

La anotación @Value en Spring se utiliza para inyectar valores en los campos de una clase desde fuentes externas como propiedades de archivos, variables de entorno, argumentos de línea de comandos, etc. Esta es una de las funciones de Spring a través de la cual se puede realizar la inyección de dependencias y la configuración externa.

### Usos comunes de `@Value`

1. **Inyección de valores de propiedades**: Puedes inyectar valores definidos en archivos de propiedades.
2. **Inyección de variables de entorno**: Puedes inyectar valores de variables de entorno del sistema.
3. **Inyección de valores predeterminados**: Puedes especificar valores predeterminados que se usarán si no se encuentra el valor externo.

Ejemplo 1

1. En el archivo application.properties agregue los siguientes valores de prueba

```
app.name=FarmVille
app.version=2.1.0
app.message=Hola desde SpringBoot Niños
app.listwords=Cacao,Cafe,Algodon
app.listaroles=Administrador,Cliente,Financiero
```

2. En el controlador de PathVariableController agregue el siguiente codigo para acceder a las variables creadas.

```java
    @Value("${app.name}")
    private String name;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
 	@Value("${app.listaroles}")
    private List<String> lstroles;
```

3. Cree un método GetMapping que permita retornar los valores de las variables

```java
    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles",lstroles)
        json.put("message",message);
        return json;
    }
```

![](https://i.ibb.co/kz76w45/image.png)

### Personalización file properties

El archivo de propiedades en Spring Boot (normalmente `application.properties` o `application.yml` si se usa YAML) se usa para ofrecer un enfoque coherente y más liviano para definir y actualizar los valores de configuración en una aplicación. Los archivos de propiedades permiten que la configuración de una aplicación se defina fuera del artefacto, lo cual es una buena práctica para actualizar la configuración de una aplicación sin cambiar el código fuente.

#### Ejercicio

🪜 Paso 1: Crear el archivo `messages.properties`

```
src/main/resources/messages.properties
```

```properties
# UsuarioDto
usuario.nombre.notblank=El nombre es obligatorio
usuario.email.notblank=El email es obligatorio
usuario.email.invalid=El correo electrónico no tiene un formato válido
usuario.edad.min=La edad mínima permitida es {value}
usuario.edad.max=La edad máxima permitida es {value}

# DireccionDto
direccion.calle.notblank=La calle no puede estar vacía
direccion.ciudad.notblank=La ciudad no puede estar vacía
direccion.codigopostal.size=El código postal debe tener exactamente {min} caracteres
```

🪜 Paso 2: Registrar el archivo en la configuración

En resources cree el archivo ValuesConfig

```
@Configuration
@PropertySources({
    @PropertySource(value="classpath:messages.properties",encoding = "UTF-8")
})
public class ValuesConfig {
}
```

🪜 Paso 3: Agregar Dependencia a pom.xml

```xml
<dependency>
    <groupId>jakarta.validation</groupId>
    <artifactId>jakarta.validation-api</artifactId>
</dependency>
```

🪜 Paso 4: Agregar las anotaciones de validación a los DTOS

```java
public class UsuarioDto {
    @NotBlank(message = "{usuario.nombre.notblank}")
    private String nombre;

    @Email(message = "{usuario.email.invalid}")
    @NotBlank(message = "{usuario.email.notblank}")
    private String email;

    @Min(value = 18, message = "{usuario.edad.min}")
    @Max(value = 99, message = "{usuario.edad.max}")
    private int edad;
}
```

## 3.6 Expresiones SpEL

Spring Expression Language (SpEL) es un potente lenguaje de expresión que se integra en el framework de Spring y permite evaluar expresiones de una manera similar a otros lenguajes de scripting. SpEL es muy flexible y se utiliza en una variedad de escenarios dentro de Spring, como la configuración de beans, la inyección de dependencias, la validación y la seguridad.

### Características de SpEL

1. **Acceso a propiedades**: Permite acceder a las propiedades de los objetos de una manera fácil.

```java
#person.name
```

2. **Invocación de métodos**: Permite llamar a métodos en los objetos.

```
#person.getName()
```

3. **Operadores**: Soporta operadores aritméticos (`+`, `-`, `*`, `/`), relacionales (`<`, `>`, `==`, `!=`), lógicos (`&&`, `||`, `!`) y otros.

```java
#a > #b
```

4. **Acceso a arrays, listas y mapas**: Permite acceder a elementos dentro de arrays, listas y mapas.

```
#list[0]
#map['key']
```

5. **Literales**: Soporta literales de números, cadenas, booleanos, y `null`.

```java
42
'Hello, World!'
true
null
```

6. **Plantillas de expresiones**: Permite incrustar expresiones dentro de cadenas.

```java
"Hello, #{#person.name}"
```

En el siguiente ejemplo se usa SpEL para construir un arreglo a partir de un split.

```java
 	@Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
```

Script completo

```java
package com.breakline.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.ParamsDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/demovar")

public class PathVariableController {

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
 	@Value("${app.listaroles}")
    private List<String> lstroles;
 	@Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
 	@Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/producto/{productname}/{id}")
    public Map<String,Object> getProduct(@PathVariable String productname,@PathVariable Long id ){
        Map<String,Object> jsonData = new HashMap<>();
        
        jsonData.put("product", productname);
        jsonData.put("id", id);

        return jsonData;
    }

    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
        user.setNombre(user.getNombre().toUpperCase());
        return user;
    }
    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("message",message);
        return json;
    }
}

```

### Anidamiento de objetos usando SpEL

Defina el valor con las propiedades en el archivo values.properties

```
app.inventory={code:'001',product:'Leche deslactosada',price:'2500'}
```

Código completo

```
app.name=FarmVille
app.version=2.1.0
app.message=Hola desde SpringBoot Niños
app.listwords=Cacao,Cafe,Algodon
app.listaroles=Administrador,Cliente,Financiero
app.inventory={code:'001',product:'Leche deslactosada',price:'2500'}

```

Codigo completo

```java
public class ParamsDto {
    private String message;

    public ParamsDto() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
```
Agregue las siguientes IOD a las clase PathVariableCotroller

```java
@Value("#{'${app.listaroles}'.split(',')}")
private List<String> customlstroles;
@Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
private List<String> customlstrolesMayuscula;
@Value("#{${app.inventory}}")
private Map<String,Object> inventory;
@Value("${app.message}")
private String message;
```

Por ejemplo se desea calcular el total del valor del producto existente en el inventario.

```java
@Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) * T(java.lang.Integer).parseInt(${app.inventory}['stock'])}")
private Long totalInv;
```

Ejemplo completo

```java
package com.breakline.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.ParamsDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/demovar")

public class PathVariableController {

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
 	@Value("${app.listaroles}")
    private List<String> lstroles;
 	@Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
 	@Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @Value("#{${app.inventory}}")
    private Map<String,Object> inventory;
    @Value("#{${app.inventory}.product}")
    private String producName;
    @Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) * T(java.lang.Integer).parseInt(${app.inventory}['stock'])}")
    private Long totalInv;

    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("inventory", inventory);
        json.put("valor", totalInv);
        json.put("message",message);
        return json;
    }
}

```

## 3.7 Trabajando con el entorno spring (Enviroment)

### @Autowired

La anotación `@Autowired` es una de las anotaciones más utilizadas en Spring Framework. Su propósito principal es permitir la inyección automática de dependencias, es decir, permitir que Spring resuelva y suministre automáticamente los beans (objetos gestionados por el contenedor de Spring) necesarios para satisfacer una dependencia en una clase.

### ¿Qué hace `@Autowired`?

1. **Inyección de Dependencias**: `@Autowired` permite a Spring inyectar automáticamente el bean apropiado en un campo, un método setter, o un constructor de una clase. Esto elimina la necesidad de inicializar manualmente las dependencias y facilita la gestión de beans.
2. **Resolución Automática**: Spring utiliza su mecanismo de resolución de beans para encontrar un bean compatible que coincida con el tipo del campo, parámetro del método o constructor donde se coloca `@Autowired`.

Ejemplo

```java
//Usando Env
@Autowired
private Environment env;
```

🔍 ¿Qué es `Environment`?

`Environment` es una interfaz del paquete `org.springframework.core.env` que expone métodos para acceder a propiedades y perfiles activos. Sirve para:

- Leer propiedades con `env.getProperty("clave")`
- Verificar si hay un perfil activo con `env.acceptsProfiles(...)`
- Obtener valores con tipo: `env.getProperty("clave", Integer.class)`

✅ ¿Por qué usar `@Autowired`?

Spring usa **inyección de dependencias** para administrar los objetos. Con `@Autowired`, Spring detecta y **inyecta el `Environment` configurado** automáticamente al iniciar la aplicación.

llamado

```java
json.put("message2",env.getProperty("app.message"));
```

Codigo completo

```java
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/demovar")
public class PathVariableController {

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
 	@Value("${app.listaroles}")
    private List<String> lstroles;
 	@Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
 	@Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @Value("#{${app.inventory}}")
    private Map<String,Object> inventory;
    @Value("#{${app.inventory}.product}")
    private String producName;
    @Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) * T(java.lang.Integer).parseInt(${app.inventory}['stock'])}")
    private Long totalInv;

    //Usando Env
    @Autowired
    private Environment env;

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/producto/{productname}/{id}")
    public Map<String,Object> getProduct(@PathVariable String productname,@PathVariable Long id ){
        Map<String,Object> jsonData = new HashMap<>();
        
        jsonData.put("product", productname);
        jsonData.put("id", id);

        return jsonData;
    }

    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
        user.setNombre(user.getNombre().toUpperCase());
        return user;
    }
    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("inventory", inventory);
        json.put("valor", totalInv);
        json.put("message",message);
        json.put("message2",env.getProperty("app.message"));
        String data = env.getProperty("app.inventory");
        JSONObject jsonObject = new JSONObject(data);
        json.put("price2",jsonObject.getLong("price"));
        return json;
    }
}

```

## 3.8 Despliegue aplicación

1. Abrir el terminal del sistema operativo donde se encuentre trabajando. Puede usar tambien la terminal de visual studio code.

2. Ubicarse en la carpeta del proyecto que se va a desplegar.

3. Listar el contenido de la carpeta.

4. Ejecute el comando **./mvnw clean package**

5. Para verificar la generación del jar ubique la carpeta target.

6. Ejecute el comando

   ```
   java -jar NombreDelJar
   ```

✅ Resumen práctico

| Sistema              | Comando                    |
| -------------------- | -------------------------- |
| Linux/macOS          | `./mvnw clean package`     |
| Git Bash/WSL         | `./mvnw clean package`     |
| Windows (CMD)        | `mvnw.cmd clean package`   |
| Windows (PowerShell) | `.\mvnw.cmd clean package` |

## 3.9 Inyección de dependencias(IoC)

Es suministrar a un objeto una referencia de otro(s) objeto(s) que necesite según la relación

> [!IMPORTANT]
>
> Resuelve el problema de reutilización y modularidad entre componentes

### 3.9.1 Como funciona

🟩 **1. El Contenedor se encarga de gestionar las instancias y dependencias...**

Esto hace referencia al **contenedor de Spring (ApplicationContext)**. Es como un **orquestador de objetos (beans)**: los **crea**, los **configura** y los **conecta** entre sí.

🔁 Ya **se usa `new` para crear objetos**, sino que dejas que Spring lo haga por ti.

------

🟫 **2. En contra-oposición de la creación explícita (`new`)**

Cuando se usa `new`, el programador se hace cargo de construir los objetos, lo que genera **acoplamiento fuerte**.

❌ Malo:

```
Servicio s = new Servicio();
```

✅ Bueno (DI):

```
@Autowired
private Servicio servicio;
```

------

🟦 **3. Esto permite un bajo acoplamiento entre los objetos**

El **bajo acoplamiento** es clave para:

- Reutilización de componentes
- Pruebas unitarias fáciles
- Menos dependencias directas = más flexibilidad

------

🟨 **4. Tiene que plasmarse mediante la anotación `@Autowired`**

La anotación `@Autowired` le indica a Spring que debe **inyectar** automáticamente la instancia adecuada.

Ejemplo:

```java
@Service
public class MiServicio {

    @Autowired
    private Repositorio repositorio;

    // Spring inyectará automáticamente un objeto tipo Repositorio aquí
}
```

------

✅ Conclusión general

> **Spring invierte el control**: El programador define qué necesita, y **Spring se encarga de entregarlo**.

Esto es **IoC (Inversión de Control)** e **Inyección de Dependencias** en acción.

### 3.9.2 @Autowired

La anotación `@Autowired` indica que un objeto gestionado por Spring (ya sea un *bean* o un componente) debe ser inyectado en un atributo de otro objeto.

Esto permite que un componente reciba automáticamente sus dependencias desde el contenedor de Spring, sin necesidad de crearlas manualmente.

Por defecto, si Spring no encuentra un candidato adecuado para inyectar, se producirá un error en tiempo de ejecución.

La anotación `@Autowired` puede ser utilizada en diferentes lugares dentro de una clase para permitir la inyección automática de dependencias por parte del contenedor de Spring. Específicamente, se puede aplicar en:

- **Atributos**: Inyecta directamente en un campo sin necesidad de un método accesor.
- **Métodos \*setter\***: Inyecta a través de un método público, permitiendo una mayor flexibilidad.
- **Constructores**: Inyecta al momento de crear el objeto, siendo la forma recomendada por garantizar la inmutabilidad de las dependencias.

Cada una de estas formas tiene sus ventajas, aunque la inyección por constructor es generalmente preferida por su claridad y compatibilidad con pruebas automatizadas.

![](https://i.ibb.co/fdwNcYYg/image.png)

#### 🔎 ¿Qué significa usar `@Autowired` en un atributo?

Aplicar `@Autowired` sobre un **atributo privado** indica que **Spring debe inyectar automáticamente** un bean (componente) que coincida con el tipo de ese atributo **durante la creación del objeto** (bean) que lo contiene.

✅ Ejemplo

```java
@Component
public class UsuarioComponent {
    @Autowired
    private IUsuarioService servicio;
}
```

En este ejemplo:

- Spring detecta la clase `UsuarioComponent` porque tiene `@Component`.
- Al encontrar el campo `servicio` anotado con `@Autowired`, Spring busca en el contexto un **bean que implemente `IUsuarioService`**.
- Spring inyecta automáticamente ese bean en el atributo `servicio`.

🚦 Cuándo es adecuado usar `@Autowired` en atributos

✔️ **Sí es adecuado**:

- En clases muy simples, sin lógica compleja.
- Si quieres código corto y directo.
- Cuando la prueba unitaria no requiere cambiar la dependencia.

❌ **No se recomienda**:

- En clases con lógica compleja.
- Si necesitas inmutabilidad (`final`).
- Si vas a hacer pruebas unitarias con mocks (más difícil de inyectar).

#### 🧠 ¿Qué significa usar `@Autowired` en un setter?

Significa que Spring inyectará automáticamente una dependencia mediante un **método `setter` público**. Esta forma es útil cuando se desea que una dependencia:

- Sea **opcional**
- Pueda ser **reemplazada o modificada** después de la construcción del objeto
- Sea **más fácil de testear o moquear**

------

🧾 Ejemplo práctico

```
@Component
public class UsuarioComponent {

    private IUsuarioService servicio;

    @Autowired
    public void setServicio(IUsuarioService servicio) {
        this.servicio = servicio;
    }
}
```

------

🔍 Explicación

- La clase está anotada con `@Component`, por lo que será administrada por el contenedor de Spring.
- Spring buscará un bean de tipo `IUsuarioService`.
- Inyectará ese bean **llamando al método `setServicio(...)`** automáticamente al crear el objeto.

------

✅ Ventajas

- Permite **inyección parcial** o condicional.
- Facilita el uso de **mocks en pruebas unitarias**.
- El objeto puede seguir inicializándose aunque la dependencia llegue después.

------

⚠️ Consideraciones

- El objeto puede estar en estado incompleto si no se llama el setter (aunque Spring siempre lo hará si hay coincidencia).
- No puedes marcar el atributo como `final`, ya que será modificado después de construido.

#### 🧩 Anotación `@Component` y sus derivados en Spring

La anotación `@Component` se utiliza para indicar que una clase es un **componente genérico**, y debe ser registrada como un **bean gestionado por el contenedor de Spring**.

##### 🧠 ¿Qué hace exactamente?

Cuando una clase está anotada con `@Component`, Spring la detecta durante el escaneo de componentes (`@ComponentScan`) y la incluye automáticamente en el contexto de la aplicación.

------

##### 🔄 Derivaciones de `@Component`

Spring proporciona **anotaciones especializadas** que son variantes de `@Component` con un propósito más semántico y organizado:

###### 1. `@Repository`

- Uso: Capas de acceso a datos (*DAOs*)
- Contexto: Persistencia y conexión con bases de datos
- Extra: Spring puede capturar excepciones específicas de base de datos y convertirlas en excepciones más manejables

###### 2. `@Service`

- Uso: Lógica de negocio
- Contexto: Procesamiento de datos, validaciones, operaciones de aplicación

###### 3. `@Controller`

- Uso: Controladores del patrón MVC
- Contexto: Manejo de peticiones HTTP y respuestas
- Se suele combinar con `@GetMapping`, `@PostMapping`, etc.

------

###### 🎯 ¿Por qué usar los derivados en lugar de `@Component`?

Aunque todas las anotaciones (`@Repository`, `@Service`, `@Controller`) **se comportan como `@Component`**, usarlas:

- Mejora la **organización del código**
- Hace que el propósito de cada clase sea **más claro**
- Permite que Spring aplique **comportamientos específicos** (por ejemplo, manejo de errores en `@Repository`)

![](https://i.ibb.co/NbbVD5j/image.png)

#### Taller IoC (Inyección de dependencias)

1. Cree un nuevo proyecto llamado iocexample

2. El nombre del Artefacto para el caso practico : app-di

3. Agregar las siguientes dependencias:

   ![](https://i.ibb.co/27bgdDKH/image.png)

4. Cree los paquetes controllers,models,repositories y services. Recuerde que estos paquetes se deben crear partiendo del paquete base.

   ![](https://i.ibb.co/YTyYxKBj/image.png)

5. Cree una clase llamada Product en el paquete models. Usando POJO

   > [!NOTE]
   >
   > POJO es un acrónimo de "Plain Old Java Object" (Objeto Java Antiguo y Simple). En términos simples, un POJO es una clase Java que no está sujeta a ninguna restricción especial aparte de las impuestas por el lenguaje Java. Es decir, no requiere que la clase implemente interfaces específicas, extienda clases predeterminadas o siga patrones particulares más allá de lo que Java estándar permite.
   >
   > ### Características de un POJO
   >
   > 1. **Simplicidad**: Un POJO es simplemente una clase Java con atributos, constructores, métodos getter y setter, y posiblemente algunos métodos adicionales para la lógica de negocio.
   > 2. **Independencia de Frameworks**: No depende de frameworks específicos. No implementa interfaces ni extiende clases proporcionadas por frameworks de terceros.
   > 3. **Ausencia de Anotaciones**: No requiere el uso de anotaciones especiales, aunque en la práctica moderna a veces se les añaden anotaciones para integrarse mejor con frameworks como Spring o JPA.
   > 4. **Encapsulamiento**: Los atributos de un POJO generalmente son privados y se accede a ellos a través de métodos getter y setter.

   ```java
   public class Product {
       private Long id;
       private String name;
       private Long price;
       
       public Product() { } // Constructor vacío (necesario para frameworks como Spring o JPA)
       
       public Product(Long id, String name, Long price) {
           this.id = id;
           this.name = name;
           this.price = price;
       }
   
       // Getters y Setters...
   }
   ```

6. Cree la clase ProductRepository en el paquete repositorios.

   > [!NOTE]
   >
   > ## Que son los repositorios
   >
   > En el contexto de desarrollo de aplicaciones con Spring Boot y JPA, un repositorio es una interfaz que proporciona mecanismos para realizar operaciones de persistencia y recuperación de datos desde una base de datos. En términos más simples, un repositorio se utiliza para interactuar con la base de datos.
   >
   > ### ¿Para qué sirve un repositorio?
   >
   > 1. **CRUD Operations**: Permite realizar operaciones básicas de creación, lectura, actualización y eliminación (Create, Read, Update, Delete) sobre las entidades de la base de datos.
   > 2. **Abstracción del Acceso a Datos**: Proporciona una capa de abstracción que separa la lógica de negocio de la lógica de acceso a datos, facilitando el mantenimiento y la evolución del código.
   > 3. **Consultas Personalizadas**: Además de las operaciones CRUD, los repositorios pueden definir consultas personalizadas utilizando el lenguaje de métodos de consulta de Spring Data JPA.
   > 4. **Soporte para Paginación y Ordenación**: Ofrecen métodos integrados para paginar y ordenar los resultados de las consultas.

   ```java
   import java.util.Arrays;
   import java.util.List;
   
   import com.di.app.app_di.models.Product;
   @Repository
   public class ProductRepository {
       List<Product> products;
   
       public ProductRepository() {
           this.products = Arrays.asList(
               new Product(1L, "Laptop", 4500000L),
               new Product(2L, "Smartphone", 2000000L),
               new Product(3L, "Tablet", 1200000L),
               new Product(4L, "Monitor", 800000L),
               new Product(5L, "Keyboard", 150000L),
               new Product(6L, "Mouse", 80000L),
               new Product(7L, "Printer", 700000L),
               new Product(8L, "External Hard Drive", 350000L),
               new Product(9L, "Headphones", 200000L),
               new Product(10L, "Webcam", 250000L)
           );
       }
   
       public List<Product> findAll() {
           return products;
       }
   
       public Product findById(Long id) {
           return products.stream()
               .filter(p -> p.getId().equals(id))
               .findFirst()
               .orElseThrow();
       }
   }
   
   ```

   > [!NOTE]
   >
   > ### `@Repository` 
   >
   > en Spring es una especialización de la anotación `@Component`, que se utiliza para indicar que una clase es un componente de la capa de persistencia. En otras palabras, marca una clase como un mecanismo para interactuar con la base de datos. Esta anotación es parte del módulo Spring Data y se usa comúnmente en combinación con interfaces que extienden `CrudRepository`, `JpaRepository`, `PagingAndSortingRepository`, entre otras.
   >
   > #### Funciones de la Anotación `@Repository`
   >
   > 1. **Indicación de Componente de Persistencia**: Al marcar una clase con `@Repository`, Spring la reconoce como un bean de Spring de la capa de persistencia y la maneja automáticamente.
   > 2. **Manejo de Excepciones**: Spring proporciona una capa de traducción de excepciones. Las excepciones específicas de tecnologías de acceso a datos (por ejemplo, JDBC, JPA, Hibernate) se traducen en excepciones no verificadas (unchecked exceptions) de Spring, que son más genéricas. La anotación `@Repository` ayuda a Spring a realizar esta traducción.
   > 3. **Configuración Automática**: En combinación con otras anotaciones de Spring, `@Repository` puede ayudar a configurar automáticamente los repositorios y el acceso a datos.

7. Cree la clase ProductService en el paquete service.

   > [!NOTE]
   >
   > ## @Service
   >
   > En el contexto del desarrollo de aplicaciones con Spring, un "service" (servicio) es una clase que contiene la lógica de negocio de la aplicación. Los servicios se utilizan para encapsular esta lógica, separándola de la capa de controladores y la capa de acceso a datos, lo que resulta en un diseño más limpio y fácil de mantener.
   >
   > ### Funciones de un Service
   >
   > 1. **Encapsulamiento de la Lógica de Negocio**: La principal función de un servicio es encapsular la lógica de negocio. Esto significa que cualquier operación que no sea directamente relacionada con la presentación de datos o con el acceso a la base de datos debería estar en la capa de servicios.
   > 2. **Reutilización**: Al centralizar la lógica de negocio en servicios, esta lógica puede ser reutilizada por diferentes partes de la aplicación.
   > 3. **Facilitar las Pruebas**: Al separar la lógica de negocio en servicios, es más fácil crear pruebas unitarias para esta lógica sin necesidad de involucrar la capa de presentación o la de acceso a datos.
   > 4. **Desacoplamiento**: Los servicios ayudan a desacoplar diferentes partes de la aplicación, facilitando el mantenimiento y la evolución del código.

   ```java
   package com.di.app.app_di.services;
   
   import java.util.List;
   import java.util.stream.Collectors;
   
   import com.di.app.app_di.models.Product;
   import com.di.app.app_di.repositories.ProductRepository;
   @Service
   public class ProductService {
   
       private ProductRepository repositoryProduct;
   
       public ProductService(ProductRepository repositoryProduct) {
           this.repositoryProduct = repositoryProduct;
       }
       public List<Product> findAll() {
           return repositoryProduct.findAll().stream().map(p -> {
               Double priceImp = p.getPrice() * 1.45d;
               p.setPrice(priceImp.longValue());
               return p;
           }).collect(Collectors.toList());
       }
   
       public Product findById(Long id) {
           return repositoryProduct.findById(id);
       }
   }
   ```

8. Cree la clase controller llamada ProductController.

   > [!NOTE]
   >
   > ## Que es un controller
   >
   > En el contexto del desarrollo de aplicaciones con Spring, un "controller" (controlador) es una clase que gestiona las solicitudes HTTP entrantes y devuelve las respuestas apropiadas. Los controladores son una parte fundamental del patrón arquitectónico MVC (Modelo-Vista-Controlador) y se encargan de coordinar la interacción entre la vista (la presentación) y el modelo (los datos y la lógica de negocio).
   >
   > ### Funciones de un Controller
   >
   > 1. **Gestión de Solicitudes HTTP**: Los controladores manejan las solicitudes HTTP (GET, POST, PUT, DELETE, etc.) que llegan al servidor y determinan cómo se deben procesar.
   > 2. **Delegación de Tareas**: Los controladores delegan tareas a los servicios, que contienen la lógica de negocio, y a los repositorios, que gestionan el acceso a los datos.
   > 3. **Construcción de Respuestas**: Los controladores crean y devuelven las respuestas HTTP apropiadas a los clientes, que pueden incluir datos en formato JSON, vistas HTML, códigos de estado HTTP, entre otros.
   > 4. **Enrutamiento**: Definen rutas o endpoints que los clientes pueden utilizar para interactuar con la aplicación.

   ```java
   @RestController
   @RequestMapping("/products")
   public class ProductController {
   
       private final ProductService productService;
   
       // Inyección por constructor (recomendado)
       public ProductController(ProductService productService) {
           this.productService = productService;
       }
   
       @GetMapping
       public List<Product> getAll() {
           return productService.findAll();
       }
   
       @GetMapping("/{id}")
       public Product getById(@PathVariable Long id) {
           return productService.findById(id);
       }
   }
   ```

### 3.9.3 @Primary y @Qualifier

#### 3.9.3.1 @Primary

¿Qué es?

La anotación `@Primary` se utiliza para marcar un bean como el bean preferido cuando hay múltiples candidatos calificados para ser inyectados en un punto de inyección.

¿Para qué se usa?

Se utiliza para evitar ambigüedades cuando existen múltiples beans del mismo tipo y no se ha especificado explícitamente cuál bean debe ser inyectado. Al marcar un bean con `@Primary`, se le da prioridad a ese bean sobre los otros.

Ejemplo de Uso

Supongamos que tenemos dos implementaciones de una interfaz `PaymentService`:

```java
public interface PaymentService {
    void processPayment();
}

@Service
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Credit Card");
    }
}

@Service
@Primary
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal");
    }
}

```

En este caso, si inyectamos `PaymentService` en otro bean sin especificar cuál implementación queremos, Spring elegirá `PaypalPaymentService` porque está marcado con `@Primary`.

```java
@Component
public class PaymentProcessor {

    private final PaymentService paymentService;

    @Autowired
    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() {
        paymentService.processPayment();
    }
}

```

Al llamar a `makePayment()`, se utilizará `PaypalPaymentService` debido a la anotación `@Primary`.

#### 3.9.3.2 @Qualifier

#### ¿Qué es?

La anotación `@Qualifier` se utiliza para resolver la ambigüedad especificando el nombre del bean que debe ser inyectado. Se utiliza junto con `@Autowired` para indicar a Spring exactamente cuál bean debe inyectarse cuando hay múltiples candidatos del mismo tipo.

#### ¿Para qué se usa?

Se usa para seleccionar explícitamente un bean específico cuando hay múltiples beans del mismo tipo disponibles en el contexto de la aplicación y se necesita más control sobre cuál bean debe ser inyectado.

#### Ejemplo de Uso

Continuando con el ejemplo anterior, supongamos que queremos inyectar específicamente `CreditCardPaymentService` en lugar de `PaypalPaymentService`.

```java
@Component
public class PaymentProcessor {

    private final PaymentService paymentService;

    @Autowired
    public PaymentProcessor(@Qualifier("creditCardPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() {
        paymentService.processPayment();
    }
}

```

En este caso, `creditCardPaymentService` se inyectará en `PaymentProcessor` debido al uso de `@Qualifier`.

### Resumen

- **@Primary**: Se utiliza para marcar un bean como el predeterminado cuando hay múltiples beans del mismo tipo. Es útil cuando hay un bean que debe usarse la mayor parte del tiempo, pero no siempre.
- **@Qualifier**: Se utiliza para especificar explícitamente cuál bean debe inyectarse cuando hay múltiples beans del mismo tipo. Proporciona un control más granular sobre la inyección de dependencias.

## 3.10 Principio de inmutabilidad

  El principio de inmutabilidad es un concepto fundamental en programación, especialmente en lenguajes de programación orientados a objetos y funcionales. Un objeto es considerado inmutable si, una vez creado, su estado no puede ser modificado. En otras palabras, todos sus atributos son finales y no pueden ser cambiados después de la creación del objeto.

   ### 3.10.1 Beneficios de la Inmutabilidad

   1. **Simplicidad**: Los objetos inmutables son más fáciles de entender y razonar, ya que su estado no cambia una vez que han sido creados.
   2. **Seguridad en Hilos (Thread Safety)**: Los objetos inmutables son inherentemente seguros en entornos concurrentes, ya que no hay riesgo de que su estado sea modificado por múltiples hilos simultáneamente.
   3. **Facilita la Depuración y Pruebas**: Dado que el estado de un objeto inmutable no cambia, es más fácil rastrear y depurar errores. También simplifica las pruebas unitarias.
   4. **Caché y Optimización**: Los objetos inmutables pueden ser reutilizados y compartidos sin riesgo de modificación, lo que permite optimizaciones como el almacenamiento en caché.

   ### 3.10.2 Aplicar inmutabilidad

   **Método A.(No recomendado)**

   1. Modifique el método findAll de la clase ProductService

      ```java
      public List<Product> findAll(){
          return repositoryProduct.findAll().stream().map(p ->{
              Double priceImp = p.getPrice() * 1.45d;
              Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
              // p.setPrice(priceImp.longValue());
              return newProduct;
          }).collect(Collectors.toList());
      }
      ```

   **Método B.(Totalmente recomendado)**

   1. Implementar la clase Clonable en la clase Producto. Para el caso practico.

      ```java
      package com.iocexample.app_di.models;
      
      public class Product implements Cloneable{
          private Long id;
          private String name;
          private Long price;
          
          public Product() { } 
          
          public Product(Long id, String name, Long price) {
              this.id = id;
              this.name = name;
              this.price = price;
          }
          public Long getId() {
              return id;
          }
          public void setId(Long id) {
              this.id = id;
          }
          public String getName() {
              return name;
          }
          public void setName(String name) {
              this.name = name;
          }
          public Long getPrice() {
              return price;
          }
          public void setPrice(Long price) {
              this.price = price;
          } 
      }
      ```

      > [!IMPORTANT]
      >
      > Sobreescribir el método clone. Para sobreecribir el metodo haga clic derecho en un espacio vacio de la clase y seleccione la opción Source Action>Override/Implements Method y seleccione el metodo clone de la lista y haga clic en aceptar.

      ```java
      @Override
      public Object clone()  {
      
          try {
              return super.clone();
          } catch (CloneNotSupportedException e) {
              return new Product(this.id, this.name, this.price);
          }
      }
      ```

      ```java
      package com.iocexample.app_di.models;
      
      public class Product implements Cloneable{
          private Long id;
          private String name;
          private Long price;
          
          public Product() { }
          
          public Product(Long id, String name, Long price) {
              this.id = id;
              this.name = name;
              this.price = price;
          }
      
          public Long getId() {
              return id;
          }
      
          public void setId(Long id) {
              this.id = id;
          }
          public String getName() {
              return name;
          }
          public void setName(String name) {
              this.name = name;
          }
          public Long getPrice() {
              return price;
          }
          public void setPrice(Long price) {
              this.price = price;
          }
          @Override
          public Object clone()  {
      
              try {
                  return super.clone();
              } catch (CloneNotSupportedException e) {
                  return new Product(this.id, this.name, this.price);
              }
          }
      }
      ```

   2. Reemplace el metodo findAll por el siguiente codigo

      ```java
      public List<Product> findAll(){
          return repositoryProduct.findAll().stream().map(p ->{
              Double priceTax = p.getPrice() * 1.45d;
              Product newProduct = (Product) p.clone();
              newProduct.setPrice(priceTax.longValue());
              return newProduct;
          }).collect(Collectors.toList());
      }
      ```

      > [!CAUTION]
      >
      > La solución presentada anteriormente presenta un acoplamiento fuerte y esto genera problemas de mantenibilidad y escalabilidad de la aplicacion.

   ## 3.11 Implementación de Desacoplamiento

   El **desacoplamiento** es un **principio de diseño de software** que busca reducir la **dependencia directa entre componentes o clases**, de modo que cada uno pueda funcionar **de forma más independiente** del resto.

   > [!NOTE]
   >
   > 🧠 ¿Qué significa "acoplamiento"?
   >
   > El **acoplamiento** se refiere a **cuánto depende una clase de otra**.
   >
   > - 🔴 **Alto acoplamiento**: una clase conoce demasiado sobre otra (cómo se crea, cómo funciona, etc.).
   > - 🟢 **Bajo acoplamiento (desacoplamiento)**: una clase solo sabe **lo mínimo necesario** sobre otra (por ejemplo, una interfaz).

### 3.11.1 Aplicar desacoplamiento

   1. Cree una nueva clase llamada **ProductServiceImpl** en el paquete service.

      ```java
      package com.iocexample.app_di.services;
      
      import java.util.List;
      
      import com.iocexample.app_di.models.Product;
      public interface ProductService {
          List<Product> findAll();
          Product findById(Long id);
      }
      ```

      ```java
      package com.iocexample.app_di.services;
      
      import java.util.List;
      import java.util.stream.Collectors;
      
      import org.springframework.stereotype.Component;
      
      import com.iocexample.app_di.models.Product;
      import com.iocexample.app_di.repositories.ProductRepository;
      
      @Component
      public class ProductServiceImpl implements ProductService {
          private final ProductRepository repositoryProduct;
      
          public ProductServiceImpl(ProductRepository repositoryProduct) {
              this.repositoryProduct = repositoryProduct;
          }
          public List<Product> findAll(){
              return repositoryProduct.findAll().stream().map(p ->{
                  Double priceTax = p.getPrice() * 1.45d;
                  Product newProduct = (Product) p.clone();
                  newProduct.setPrice(priceTax.longValue());
                  return newProduct;
              }).collect(Collectors.toList());
          }
          public Product findById(Long id) {
              return repositoryProduct.findById(id);
          }
      }
      ```

   2. Modifique cree la clase ProductRepositoryImpl y convierta la clase ProductRepository en una interface

      ```java
      package com.iocexample.app_di.repositories;
      
      import java.util.List;
      import com.iocexample.app_di.models.Product;
      
      public interface ProductRepository {
          List<Product> findAll();
          Product findById(Long id);
      }
      ```

      ```java
      package com.iocexample.app_di.repositories;
      import java.util.Arrays;
      import java.util.List;
      
      import org.springframework.stereotype.Component;
      
      import com.iocexample.app_di.models.Product;
      
      @Component
      public class ProductRepositoryImpl implements ProductRepository {
          List<Product> products;
      
          public ProductRepositoryImpl() {
              this.products = Arrays.asList(
                  new Product(1L, "Laptop", 4500000L),
                  new Product(2L, "Smartphone", 2000000L),
                  new Product(3L, "Tablet", 1200000L),
                  new Product(4L, "Monitor", 800000L),
                  new Product(5L, "Keyboard", 150000L),
                  new Product(6L, "Mouse", 80000L),
                  new Product(7L, "Printer", 700000L),
                  new Product(8L, "External Hard Drive", 350000L),
                  new Product(9L, "Headphones", 200000L),
                  new Product(10L, "Webcam", 250000L)
              );
          }
      
          public List<Product> findAll() {
              return products;
          }
      
          public Product findById(Long id) {
              return products.stream()
                  .filter(p -> p.getId().equals(id))
                  .findFirst()
                  .orElseThrow();
          }
      }
      ```


## 3.12 @RequestScope

### 3.12.1 ¿Qué es @RequestScope?

`@RequestScope` es una especialización de la anotación `@Scope` de Spring y define que el ámbito del bean es una solicitud HTTP. En términos prácticos, esto significa que el bean existirá solamente durante la duración de una solicitud HTTP.

### 3.12.2 ¿Para qué se usa @RequestScope?

Se usa para garantizar que un bean sea único y exclusivo para cada solicitud HTTP. Esto es útil en escenarios donde el estado del bean no debe ser compartido entre diferentes solicitudes y debe ser específico para cada una. Algunos ejemplos de uso incluyen:

1. **Datos de Usuario en una Sesión**: Mantener datos específicos del usuario que son necesarios solo durante la solicitud actual.
2. **Recursos Temporales**: Manejar recursos que son necesarios solo durante una solicitud específica y deben ser liberados inmediatamente después.
3. **Transacciones**: Cuando se necesita que cada solicitud tenga su propio contexto de transacción.

**Implementando en ejemplo base**

🧩 Interfaz común

```java
public interface ProductRepository {
    List<String> findAll();
}
```

------

🟧 Implementación oficial

```java
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {
    public List<String> findAll() {
        return List.of("Laptop", "Tablet", "Monitor");
    }
}
```

------

🟨 Implementación de prueba

```java
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("mockProductList")
public class MockProductRepository implements ProductRepository {
    public List<String> findAll() {
        return List.of("Fake Laptop", "Fake Tablet");
    }
}
```

------

🛠 Servicio que usa una implementación por nombre

```java
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(@Qualifier("productList") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getAll() {
        return productRepository.findAll();
    }
}
```

🔁 Si quisiera usar el mock:

```
@Qualifier("mockProductList")
```

------

🌐 Controlador REST

```java
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<String> getProducts() {
        return service.getAll();
    }
}
```

## 3.13 @SessionScope

### 3.13.1 ¿Qué es @SessionScope?

`@SessionScope` es una especialización de la anotación `@Scope` de Spring que define que el ámbito del bean es una sesión HTTP. En términos prácticos, esto significa que el bean existirá durante la duración de la sesión del usuario y se compartirá entre múltiples solicitudes dentro de esa misma sesión.

> [!IMPORTANT]
>
> En aplicaciones web desarrolladas con Spring Boot, los *beans* definidos en el contexto de la aplicación son, por defecto, de tipo **singleton**. Esto significa que una única instancia del bean es compartida por todos los usuarios y peticiones. Sin embargo, existen situaciones donde es necesario que cada usuario mantenga su propio estado durante el tiempo que dure su sesión en la aplicación.

### 3.13.2 ¿Para qué se usa @SessionScope?

Se usa para mantener el estado del usuario a lo largo de una sesión. Esto es útil en escenarios donde se necesita que los datos persistan entre diferentes solicitudes del mismo usuario. Algunos ejemplos de uso incluyen:

1. **Carritos de Compras**: Mantener el estado del carrito de compras de un usuario mientras navega por una tienda en línea.
2. **Datos del Usuario**: Almacenar información específica del usuario que es necesaria durante toda la sesión, como detalles de autenticación o preferencias del usuario.
3. **Formularios en Varios Pasos**: Mantener el estado de un formulario que se completa en varios pasos a lo largo de la sesión del usuario.

#### **Ejemplo**

El siguiente ejemplo demuestra cómo aplicar la anotación `@SessionScope` para crear un bean cuyo ciclo de vida esté vinculado a la sesión HTTP de un usuario. De esta forma, cada usuario obtiene su propia instancia, lo cual es ideal cuando se desea almacenar datos temporales específicos del usuario sin recurrir a una base de datos.

##### 🎯 **Escenario de ejemplo: Contador de visitas por sesión**

Se plantea el caso de una aplicación web donde se desea llevar un conteo de cuántas veces un usuario accede a un determinado endpoint durante su sesión. Este tipo de funcionalidad puede servir para:

- Mostrar mensajes personalizados según el número de visitas.
- Implementar lógica de formularios paso a paso.
- Realizar un seguimiento del flujo de navegación por sesión.
- Probar o depurar el comportamiento por usuario.

------

##### 🧱 **Implementación**

1. **Bean con estado de sesión**

Se define una clase `VisitCounter` anotada con `@Component` y `@SessionScope`, lo que indica que cada sesión de usuario tendrá su propia instancia del bean. Esta clase simplemente mantiene un contador que se incrementa en cada acceso.

```java
@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class VisitCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

2. **Controlador REST**

Se crea un controlador REST con un endpoint `/visit`. Cada vez que se accede a este endpoint, se incrementa el contador de visitas almacenado en la sesión actual.

```java
@RestController
public class VisitController {

    private final VisitCounter visitCounter;

    public VisitController(VisitCounter visitCounter) {
        this.visitCounter = visitCounter;
    }

    @GetMapping("/visit")
    public String visit() {
        visitCounter.increment();
        return "Número de visitas en esta sesión: " + visitCounter.getCount();
    }
}
```

------

##### 🔄 **Comportamiento en tiempo de ejecución**

- Cuando un usuario accede por primera vez al endpoint `/visit`, Spring crea una nueva sesión y una nueva instancia del bean `VisitCounter`.
- En cada visita posterior, se reutiliza esa misma instancia, lo que permite llevar el conteo.
- Si otro usuario accede desde un navegador distinto o desde modo incógnito, se le asigna una sesión nueva, con su propio contador independiente.
- Cuando la sesión expira, también se destruye la instancia del bean asociado.

------

##### 🧪 **Pruebas sugeridas**

- Acceder varias veces desde el mismo navegador a `http://localhost:8080/visit` y verificar que el número incrementa.
- Abrir otro navegador o una ventana en modo incógnito y ver que el contador inicia en 1.
- Cerrar el navegador o esperar que expire la sesión (por defecto 30 minutos) y verificar que el contador se reinicia.

🔄**Obteniendo datos de variables de session**

```java
@RestController
public class InfoController {

    private final VisitCounter visitCounter;

    public InfoController(VisitCounter visitCounter) {
        this.visitCounter = visitCounter;
    }

    @GetMapping("/session-info")
    public String sessionInfo() {
        return "Visitas actuales en esta sesión: " + visitCounter.getCount();
    }
}
```

### 🛠️ Taller: Autenticación básica con manejo de sesión en Spring Boot

------

#### 🎯 Objetivo

- Autenticar un usuario mediante nombre y contraseña.
- Almacenar el usuario autenticado en la sesión.
- Proteger un endpoint para que solo funcione si hay un usuario autenticado.
- Permitir consultar:
  - El nombre del usuario autenticado.
  - El tiempo transcurrido desde el inicio de la sesión.

------

#### 🧩 Tecnologías y dependencias

**Dependencias (en `pom.xml` o `build.gradle`):**

- `spring-boot-starter-web`
- (Opcional: `spring-boot-starter-thymeleaf` si deseas interfaz web)

------

#### 🗃️ Estructura de carpetas

```bash
src/
└── main/
    └── java/com/example/sessiondemo/
        ├── SessionUser.java
        ├── AuthController.java
        ├── UserSession.java (@SessionScope)
        └── SessionDemoApplication.java
```

------

#### 1️⃣ `SessionUser.java`: modelo simple de usuario

```java
package com.example.sessiondemo;

public class SessionUser {
    private String username;
    private long loginTime;

    public SessionUser(String username) {
        this.username = username;
        this.loginTime = System.currentTimeMillis();
    }

    public String getUsername() {
        return username;
    }

    public long getLoginTime() {
        return loginTime;
    }
}
```

------

#### 2️⃣ `UserSession.java`: bean con `@SessionScope` para almacenar datos del usuario autenticado

```java
package com.example.sessiondemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSession {

    private SessionUser user;

    public void login(String username) {
        this.user = new SessionUser(username);
    }

    public SessionUser getUser() {
        return user;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public void logout() {
        this.user = null;
    }
}
```

------

#### 3️⃣ `AuthController.java`: controlador de autenticación y endpoints protegidos

```java
package com.example.sessiondemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final UserSession userSession;

    public AuthController(UserSession userSession) {
        this.userSession = userSession;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Aquí se puede agregar validación real. Por ahora es fijo.
        if ("admin".equals(username) && "1234".equals(password)) {
            userSession.login(username);
            return "Usuario autenticado exitosamente.";
        }
        return "Credenciales inválidas.";
    }

    @GetMapping("/me")
    public String currentUser() {
        if (!userSession.isLoggedIn()) {
            return "No estás autenticado.";
        }
        SessionUser user = userSession.getUser();
        long elapsedSeconds = (System.currentTimeMillis() - user.getLoginTime()) / 1000;
        return String.format("Usuario: %s\nSesión activa desde hace: %d segundos",
                user.getUsername(), elapsedSeconds);
    }

    @PostMapping("/logout")
    public String logout() {
        if (!userSession.isLoggedIn()) {
            return "No hay sesión activa.";
        }
        userSession.logout();
        return "Sesión cerrada.";
    }
}
```

------

#### 4️⃣ `SessionDemoApplication.java`: clase principal

```java
package com.example.sessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SessionDemoApplication.class, args);
    }
}
```

------

#### 🧪 Cómo probarlo

Puedes usar **Postman**, **curl** o el navegador (si haces una interfaz web).

##### 🔐 1. Iniciar sesión

```
POST http://localhost:8080/api/login
Body (x-www-form-urlencoded):
username=admin
password=1234
```

##### 👤 2. Ver información del usuario

```
GET http://localhost:8080/api/me
```

##### **Respuesta esperada:**

```
Usuario: admin
Sesión activa desde hace: 5 segundos
```

##### 🚪 3. Cerrar sesión

```
POST http://localhost:8080/api/logout
```

------

### ✅ Resultado esperado

Este taller permite entender cómo:

- Controlar la sesión con `@SessionScope`.
- Guardar y recuperar el usuario autenticado.
- Medir el tiempo de sesión.
- Crear endpoints seguros basados en sesión **sin usar Spring Security** ni JPA.

## 3.14 Trabajando con Archivos JSON

En el desarrollo de aplicaciones basadas en **Spring Boot**, es común la necesidad de consumir datos estructurados almacenados en archivos de configuración o catálogos estáticos. Uno de los formatos más utilizados para este propósito es **JSON (JavaScript Object Notation)**, debido a su simplicidad, legibilidad y amplia interoperabilidad entre sistemas.

Dentro de un proyecto Spring Boot, los archivos ubicados en el directorio `src/main/resources` forman parte del **classpath de la aplicación**. Durante el proceso de compilación y empaquetado, dichos recursos son incorporados al artefacto final (JAR o WAR), lo que implica que su acceso no debe realizarse como archivos físicos del sistema, sino como **recursos gestionados por el classloader** de Java.

Spring Framework proporciona una abstracción denominada `Resource`, la cual permite acceder a distintos tipos de recursos (classpath, filesystem, URL, entre otros) de manera uniforme. En el caso de recursos ubicados en el classpath, el uso de implementaciones como `ClassPathResource` garantiza la correcta lectura del contenido independientemente del entorno de ejecución. Esta aproximación evita dependencias directas con la estructura del sistema de archivos y asegura portabilidad entre entornos de desarrollo, pruebas y producción.

Para la deserialización del contenido JSON, Spring Boot integra de forma nativa la biblioteca **Jackson**, la cual permite transformar datos estructurados en representaciones tipadas del dominio mediante el uso de objetos Java (POJOs). Cuando el archivo JSON contiene colecciones de elementos, como listas de productos con atributos definidos, es necesario emplear mecanismos que preserven la información de tipos genéricos durante el proceso de lectura, asegurando una conversión consistente y segura.

Desde una perspectiva arquitectónica, el uso de archivos JSON en `resources` se justifica principalmente en escenarios donde los datos poseen un carácter **estático o semiestático**, tales como catálogos iniciales, configuraciones base o información de referencia. En sistemas de mayor complejidad, como plataformas educativas o sistemas de gestión, esta técnica suele emplearse como una etapa inicial de carga de datos, previo a su persistencia en una base de datos o a su exposición controlada a través de servicios de aplicación.

En conclusión, el acceso a archivos JSON desde el classpath en Spring Boot constituye una práctica estándar que combina portabilidad, desacoplamiento y claridad estructural. Su correcta implementación requiere comprender el modelo de empaquetado de la plataforma, la abstracción de recursos provista por el framework y los mecanismos de serialización utilizados para transformar datos externos en estructuras internas del sistema.

### 3.14.1 Dependencias requeridas

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
```

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
</dependency>
```

### Ejercicio Guiado

1) **Estructura del archivo JSON en `resources`**

**Ubicación recomendada:**

```
src/main/resources/data/products.json
```

**Contenido del archivo:**

```json
[
  {
    "id": 1,
    "nombre": "Teclado Mecánico",
    "precio": 250000,
    "stock": 15
  },
  {
    "id": 2,
    "nombre": "Mouse Gamer",
    "precio": 120000,
    "stock": 30
  },
  {
    "id": 3,
    "nombre": "Monitor 24 pulgadas",
    "precio": 950000,
    "stock": 8
  }
]
```

Este JSON representa **una colección**, por lo tanto en Java se mapeará como `List<Producto>`.

------

2) **Crear el POJO / DTO `Producto`**

Este objeto representa **una fila del JSON**.

```java
public class Producto {

    private Long id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(Long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
```

> [!IMPORTANT]
>
> **Notas pedagógicas:**
>
> - Se requiere **constructor vacío** para que Jackson pueda instanciar el objeto.
> - Los nombres de los atributos **deben coincidir** con las claves del JSON.

------

3) Leer el JSON desde `resources` usando `ClassPathResource`

> [!CAUTION]
>
> **Concepto clave**
>
> Spring Boot empaqueta `resources` dentro del **classpath**. Por ello, el JSON se debe leer **como stream**, no como `File`.

**Servicio lector de productos**

```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ProductJsonService {

    private final ObjectMapper objectMapper;

    public ProductJsonService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Producto> obtenerProductos() {

        try (InputStream is =
                     new ClassPathResource("data/products.json").getInputStream()) {

            return objectMapper.readValue(
                    is,
                    new TypeReference<List<Producto>>() {}
            );

        } catch (Exception e) {
            throw new IllegalStateException(
                    "Error al leer el archivo products.json desde resources", e
            );
        }
    }
}
```

> [!NOTE]
>
> ¿Qué está pasando aquí?
>
> 1. `ClassPathResource("data/products.json")`
>    - Localiza el archivo dentro de `src/main/resources`.
> 2. `getInputStream()`
>    - Permite leer el recurso incluso cuando la app está empaquetada en JAR.
> 3. `TypeReference<List<Producto>>`
>    - Jackson necesita esta referencia porque trabaja con **genéricos**.

**4) Exponer los productos vía un** `@RestController`

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductJsonService productJsonService;

    public ProductController(ProductJsonService productJsonService) {
        this.productJsonService = productJsonService;
    }

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return productJsonService.obtenerProductos();
    }
}
```

Cree archivo de configuración del objectMapper

```java
package com.bkseducate.app_json_consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().findAndRegisterModules();
    }
}
```

> [!NOTE]
>
> **¿Por qué usar una clase `@Configuration`?**
>
> Desde el punto de vista del contenedor IoC:
>
> - `@Configuration` indica que la clase define **beans gestionados**
> - `@Bean` expone el `ObjectMapper` como dependencia reutilizable
> - Spring inyecta este `ObjectMapper` en cualquier clase que lo requiera
>
> Esto permite:
>
> - Centralizar configuración
> - Evitar duplicación
> - Asegurar consistencia en serialización/deserialización

Al consumir:

```
GET http://localhost:8080/productos
```

Respuesta:

```json
[
  {
    "id": 1,
    "nombre": "Teclado Mecánico",
    "precio": 250000,
    "stock": 15
  },
  ...
]
```

Repositorio : https://github.com/trainingLeader/app-json-consumer.git

# 4. SpringBoot Avanzado

En este capítulo **Spring Boot Avanzado** se orienta al estudio profundo de los mecanismos internos, patrones de configuración y capacidades extendidas del framework Spring Boot, más allá de su uso introductorio o convencional. En esta etapa, el análisis se desplaza desde la simple construcción de aplicaciones funcionales hacia la **comprensión estructural del framework**, sus decisiones de diseño y su correcta aplicación en sistemas de mediana y alta complejidad.

Spring Boot se caracteriza por ofrecer un modelo de desarrollo basado en la **auto-configuración**, la **convención sobre configuración** y la integración transparente con el ecosistema Spring. Sin embargo, el uso avanzado del framework exige entender cómo y cuándo intervenir dicho comportamiento por defecto, así como los impactos arquitectónicos que estas intervenciones generan en el ciclo de vida de la aplicación, el contenedor IoC y la gestión de dependencias.

En este capítulo se abordan conceptos que permiten ejercer un control más preciso sobre la infraestructura de la aplicación, tales como la definición explícita de beans, la configuración personalizada de componentes críticos (por ejemplo, serialización, gestión de recursos y contexto de ejecución), el manejo del classpath, y la separación clara de responsabilidades entre capas. Estos temas resultan fundamentales para garantizar mantenibilidad, escalabilidad y coherencia técnica en proyectos reales.

Desde una perspectiva formativa, Spring Boot Avanzado introduce al estudiante en prácticas propias del desarrollo profesional, incluyendo la lectura e interpretación de configuraciones internas, la extensión del framework mediante clases de configuración, y el uso consciente de abstracciones provistas por Spring. El énfasis deja de estar en “hacer que funcione” y se traslada a “entender por qué funciona”, promoviendo un razonamiento arquitectónico sólido.

Asimismo, el capítulo prepara el terreno para la adopción de enfoques más robustos, como arquitecturas limpias, diseño orientado al dominio y principios de desacoplamiento, donde Spring Boot actúa como una capa de infraestructura y no como el núcleo del modelo de negocio. En este contexto, el framework se utiliza como una herramienta estratégica que facilita la orquestación de componentes sin invadir la lógica central del sistema.

En conclusión, el capítulo Spring Boot Avanzado consolida los conocimientos necesarios para utilizar el framework de manera consciente, extensible y alineada con estándares de ingeniería de software, sentando las bases para el desarrollo de aplicaciones empresariales, plataformas educativas y sistemas distribuidos con altos requisitos de calidad técnica.

## 4.1 Hibernate

Es una herramienta de mapeo de objeto relacional (ORM) que permite trabajar los datos de una base de datos (RDBMS) en forma de clases y objetos (lenguaje POO). https://hibernate.org/

<img src="https://i.ibb.co/KJ9mKs0/Hibernate-Arch.png" style="zoom: 50%;" />

**Capa superior: Repositorio / DAO**

**Rol**

La capa **Repositorio / DAO** representa el **punto de entrada desde la aplicación** hacia la persistencia.

**Responsabilidad**

- Encapsular el acceso a datos
- Exponer operaciones como:
  - guardar
  - buscar
  - actualizar
  - eliminar
- Ocultar los detalles técnicos de Hibernate o JDBC

> [!TIP]
>
> Esta capa **no sabe** cómo se accede realmente a la base de datos; solo delega la operación. Esto promueve **desacoplamiento** y **mantenibilidad**.

**Dos caminos de acceso: JPA y Hibernate Native API**

Desde el repositorio se pueden tomar **dos rutas**, ambas válidas.

**Java Persistence API (JPA)**

JPA es una **especificación estándar** de Java para persistencia de datos.

**Elemento clave**

- **EntityManager**

El `EntityManager` es el objeto que:

- Gestiona entidades
- Controla el contexto de persistencia
- Ejecuta operaciones CRUD

**Características**

- Independiente del proveedor (Hibernate, EclipseLink, etc.)
- Recomendado para aplicaciones empresariales
- Mayor portabilidad

📌 En la imagen, el globo verde indica que **EntityManager pertenece a JPA**, no a Hibernate directamente.

------

**Hibernate Native API**

Es la **API propia de Hibernate**, más específica y potente.

**Elemento clave**

- **Session**

La `Session`:

- Es el equivalente funcional del `EntityManager`
- Ofrece mayor control y funcionalidades avanzadas
- Está acoplada directamente a Hibernate

📌 En la imagen, el globo morado indica que **Session es propia de Hibernate**.

------

**Núcleo de Hibernate (Core)**

Independientemente de si se usa **JPA o la API nativa**, ambas rutas **convergen aquí**.

**Componentes principales**

Dentro del núcleo de Hibernate aparecen:

- **SessionFactory**
  - Se crea una vez
  - Es costosa
  - Produce sesiones
- **Session**
  - Representa una unidad de trabajo
  - Maneja el ciclo de vida de las entidades
- **Transaction**
  - Controla commits y rollbacks
- **Query**
  - Ejecuta HQL, JPQL o SQL nativo

**Rol fundamental**

Hibernate:

- Traduce operaciones sobre objetos Java
- Genera automáticamente SQL
- Gestiona caché, sincronización y estados de entidades

------

**Capa JDBC**

**Qué representa**

JDBC es la **API de bajo nivel** de Java para interactuar con bases de datos.

**Rol en la arquitectura**

- Hibernate **no accede directamente** a la base de datos
- Utiliza JDBC como canal de comunicación
- Gestiona:
  - conexiones
  - prepared statements
  - result sets

📌 Hibernate **envuelve y abstrae** JDBC, evitando que el desarrollador lo use directamente.

------

**Base de datos**

**Rol final**

Es el sistema de persistencia real:

- MySQL
- PostgreSQL
- Oracle
- SQL Server
- etc.

Hibernate:

- Genera SQL compatible con el dialecto
- Ejecuta operaciones
- Recibe resultados
- Los transforma nuevamente en objetos Java

------

**Flujo completo resumido**

1. La aplicación llama al **Repositorio**
2. El repositorio usa:
   - `EntityManager` (JPA) **o**
   - `Session` (Hibernate)
3. Hibernate procesa la operación
4. Hibernate usa JDBC
5. JDBC ejecuta SQL en la base de datos
6. El resultado vuelve como objetos Java

### 4.1.1 Tipos de consulta

#### 4.1.1.1 HQL

HQL, o Hibernate Query Language, es un lenguaje de consulta orientado a objetos similar a SQL, pero diseñado específicamente para trabajar con Hibernate, un framework de mapeo objeto-relacional (ORM) en Java. HQL permite realizar consultas y manipulaciones en la base de datos utilizando las clases y atributos del modelo de datos en lugar de las tablas y columnas de la base de datos.

**Características de HQL**

1. **Orientado a objetos**: HQL utiliza las entidades del modelo de datos de Hibernate en lugar de tablas de la base de datos.
2. **Consulta independiente de la base de datos**: HQL es independiente del sistema de gestión de bases de datos subyacente, lo que facilita la portabilidad del código.
3. **Similar a SQL**: Aunque HQL es un lenguaje propio de Hibernate, su sintaxis es muy similar a la de SQL, lo que facilita su aprendizaje para quienes ya conocen SQL.
4. **Soporte para funciones de agregación y subconsultas**: HQL admite funciones de agregación (como SUM, COUNT, AVG) y subconsultas, al igual que SQL.
5. **Operaciones de asociación y herencia**: HQL permite realizar consultas sobre asociaciones y herencias definidas en el modelo de datos, facilitando la navegación entre entidades relacionadas.

**Ventajas de usar HQL**

- **Abstracción del modelo de datos**: Permite trabajar a un nivel más alto de abstracción, utilizando objetos y sus relaciones.
- **Portabilidad**: Las consultas HQL no están vinculadas a un SGBD específico, lo que facilita cambiar de una base de datos a otra sin modificar el código de las consultas.
- **Integración con Hibernate**: HQL se integra perfectamente con las capacidades de Hibernate, como la caché de segundo nivel y las transacciones.

#### 4.1.1.2 Criteria API

La Criteria API en Spring Boot es una forma programática y tipada de construir consultas para bases de datos utilizando Hibernate como proveedor JPA. A diferencia de JPQL (Java Persistence Query Language), que utiliza cadenas de texto para definir consultas, la Criteria API permite construir consultas de manera fluida utilizando la API de Java, lo que facilita la creación de consultas dinámicas y refactorizables.

**Características de la Criteria API**

1. **Tipado seguro**: La Criteria API utiliza clases y métodos en lugar de cadenas de texto, lo que permite que el compilador de Java detecte errores de sintaxis y tipo.
2. **Consultas dinámicas**: Facilita la construcción de consultas dinámicas en función de los parámetros recibidos en tiempo de ejecución.
3. **Reutilización**: Las consultas Criteria pueden ser fácilmente reutilizadas y combinadas.
4. **Facilidad de mantenimiento**: Al estar escritas en código Java, las consultas son más fáciles de mantener y refactorizar.

#### 4.1.1.3 SQL Native

SQL nativo, también conocido como SQL puro o SQL sin procesar, se refiere al uso directo del lenguaje de consulta estructurado (SQL) para interactuar con una base de datos desde una aplicación. A diferencia de los ORM (Object-Relational Mapping) y otras abstracciones que proporcionan una capa intermedia entre el código de la aplicación y la base de datos, el uso de SQL nativo implica escribir consultas SQL directamente.

**Características del SQL Nativo**

1. **Directo y eficiente**: Permite un acceso directo a las capacidades de la base de datos, lo que puede resultar en un mejor rendimiento y control.
2. **Complejidad de las consultas**: Ideal para consultas complejas y específicas que pueden ser difíciles de expresar utilizando ORM o abstracciones de consultas.
3. **Dependencia del SGBD**: Las consultas SQL nativas pueden depender de las características específicas del sistema de gestión de bases de datos (SGBD) que se está utilizando, lo que puede afectar la portabilidad de la aplicación.

##### Ejemplo

```java
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String departamento;
    private Double salario;

    // Getters y setters
}
```

```java
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query(value = "SELECT * FROM Empleado WHERE departamento = ?1 AND salario >= ?2", nativeQuery = true)
    List<Empleado> encontrarPorDepartamentoYSalario(String departamento, Double salarioMinimo);
}
```

## 4.2 JPA https://spring.io/projects/spring-data

JPA (Java Persistence API) es una especificación de Java que estandariza el mapeo de objetos Java a tablas en bases de datos relacionales. JPA proporciona un marco común para el acceso y la gestión de datos persistentes en aplicaciones Java, definiendo una API para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) y consultas en bases de datos de manera uniforme.

### 4.2.1 Características de JPA

1. **Mapeo de Entidades**: Define cómo mapear las clases Java a tablas en la base de datos utilizando anotaciones.
2. **Consultas**: Proporciona JPQL (Java Persistence Query Language) para escribir consultas orientadas a objetos.
3. **Gestión del Ciclo de Vida de Entidades**: Gestiona el ciclo de vida de las entidades (persistencia, fusión, eliminación).
4. **Relaciones entre Entidades**: Facilita la definición de relaciones entre entidades (uno a uno, uno a muchos, muchos a uno, muchos a muchos).
5. **Transacciones**: Maneja transacciones para asegurar la integridad y consistencia de los datos.

### 4.2.2 Componentes Principales de JPA

1. **Entidades**: Clases Java que representan las tablas en la base de datos.
2. **Entity Manager**: La interfaz principal de JPA que gestiona las operaciones de persistencia.
3. **Persistencia**: El contexto de persistencia define el entorno en el que se gestionan las entidades.
4. **Consultas**: JPQL permite realizar consultas a la base de datos de manera similar a SQL, pero con un enfoque orientado a objetos.

### 4.2.3 JPA Query Methods(https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html)

#### 4.2.3.1 Qué son los JPA Query Methods?

Los JPA Query Methods son métodos de consulta definidos en los repositorios de Spring Data JPA. Estos métodos permiten realizar consultas a la base de datos sin necesidad de escribir consultas SQL explícitas. Spring Data JPA genera automáticamente las consultas basadas en los nombres de los métodos siguiendo ciertas convenciones.

#### 4.2.3.2 Convenciones de Nombres en JPA Query Methods

Los nombres de los métodos de consulta siguen ciertas convenciones para que Spring Data JPA pueda derivar la consulta. Aquí hay algunos ejemplos y una lista de las convenciones más comunes:

##### **Simple Keyword**:

- `findBy`: Encuentra por un campo específico.
- `readBy`: Lee por un campo específico.
- `queryBy`: Consulta por un campo específico.
- `countBy`: Cuenta por un campo específico.
- `getBy`: Obtiene por un campo específico.

##### **Palabras Clave Lógicas**:

- `And`: Conjunción lógica (y).
- `Or`: Conjunción lógica (o).

##### **Palabras Clave de Comparación**:

- `Is`, `Equals`: Igual a.
- `Between`: Entre dos valores.
- `LessThan`, `LessThanEqual`: Menor que, menor o igual que.
- `GreaterThan`, `GreaterThanEqual`: Mayor que, mayor o igual que.
- `After`, `Before`: Después de, antes de (normalmente utilizado con fechas).
- `IsNull`, `IsNotNull`, `NotNull`: Nulo, no nulo.
- `Like`: Similar a (uso de comodines `%` y `_`).
- `NotLike`: No similar a.
- `StartingWith`: Comienza con.
- `EndingWith`: Termina con.
- `Containing`: Contiene.
- `OrderBy`: Ordenado por.

##### **Palabras Clave de Colección**:

- `In`: En una colección.
- `NotIn`: No en una colección.

## 4.3. Arquitectura Hexagonal

La arquitectura hexagonal, busca que la aplicación pueda funcionar y ser probada **sin depender** de UI, base de datos o servicios externos. La idea es aislar el núcleo de negocio y conectar el mundo externo mediante adaptadores intercambiables.

> [!TIP]
>
> La idea central: dependencia hacia adentro
>
> En una arquitectura “típica” por capas, a menudo la capa de dominio termina dependiendo de detalles de infraestructura (ORM, HTTP clients, etc.). La hexagonal invierte esto: **el dominio no depende de infraestructura**; la infraestructura depende del dominio. Martin Fowler lo resume con el cambio de dependencias:
>  **UI → dominio ← datasource**.

#### A. Núcleo (Core)

Suele dividirse en:

- **Dominio (Domain Model)**: reglas de negocio puras (entidades, VOs, agregados, invariantes).
- **Aplicación (Use Cases / Application Services)**: orquestación de casos de uso (transacciones, coordinación de repositorios/servicios externos vía puertos, validaciones de flujo).

> Nota: Hexagonal no obliga a separar “aplicación vs dominio”, pero es una separación muy común y útil en sistemas medianos/grandes.

#### B. Puertos (Ports)

Son **interfaces** que el núcleo expone o requiere:

1. **Inbound Ports (Driving / Primary ports)**
    Representan lo que el sistema “ofrece”: casos de uso.
    Ej.: `EnrollStudentUseCase`, `PayLessonUseCase`.
2. **Outbound Ports (Driven / Secondary ports)**
    Representan lo que el sistema “necesita” del exterior: persistencia, mensajería, proveedores, email, storage, etc.
    Ej.: `CourseRepository`, `PaymentGatewayPort`, `EmailSenderPort`.

Los puertos son el “contrato” estable del core. Todo lo externo se adapta a esos contratos.

#### C. Adaptadores (Adapters)

Implementan puertos y conectan con tecnologías concretas.

1. **Inbound adapters** (controlan el “input” hacia el core)

- REST controllers (Spring MVC), GraphQL resolvers, CLI, consumers de colas, schedulers batch.

1. **Outbound adapters** (conectan el core con el exterior)

- Persistencia: JPA/Hibernate, JDBC, Mongo, etc.
- Integraciones: clientes HTTP (WebClient/Feign), SDKs, colas (Kafka/Rabbit), S3, etc.

### Beneficios clave

- **Testabilidad**: el core se prueba con dobles (mocks/fakes) de outbound ports; no necesitas DB real para la lógica. 
- **Evolución tecnológica**: cambias JPA→JDBC, REST→mensajería, proveedor A→B, sin tocar reglas de negocio (solo adaptadores).
- **Menos acoplamiento**: se reducen dependencias “contaminantes” en el dominio.

> [!TIP]
>
> Microsoft describe que, al seguir DIP y DDD, muchas soluciones convergen a estilos como Hexagonal/Ports-and-Adapters/Clean/Onion.

> [!CAUTION]
>
> Errores comunes (importante)
>
> - Poner `@Entity`, `@Repository`, `JpaRepository` dentro del dominio: eso rompe el aislamiento.
> - Confundir “hexagonal” con “muchas capas” o con “microservicios”. Hexagonal es **un patrón de arquitectura interna**; puedes aplicarlo en monolitos o microservicios.
> - “Puertos” como DTOs: no. Puertos son **interfaces** (contratos) de entrada/salida del core.

## 4.4 Domain-Driven Design (DDD)

DDD es un enfoque para diseñar software poniendo el **dominio del negocio** en el centro: lenguaje, modelo y límites del sistema.

### 4.4.1 DDD estratégico (para diseñar el sistema y sus límites)

1. **Ubiquitous Language**
    Un lenguaje compartido entre negocio y equipo técnico; los nombres del código reflejan conceptos reales.
2. **Bounded Contexts**
   Cada contexto define un modelo y lenguaje coherentes; evita que un “modelo gigante” intente representar todo. (Ej.: en un LMS, “Billing” y “Learning” suelen ser contextos distintos).
3. **Context Mapping**
    Define cómo se relacionan contextos (integraciones, traducciones, anticorruption layer, etc.).

> El DDD estratégico reduce ambigüedad y evita que una sola taxonomía intente cubrir realidades distintas.

### 4.4.2 DDD táctico (para modelar dentro de un contexto)

Los “building blocks” más usados:

- **Entity**: tiene identidad; cambia con el tiempo.
- **Value Object**: no tiene identidad propia; se define por su valor; idealmente inmutable.
- **Aggregate & Aggregate Root**: clúster de entidades/VOs con límites claros; el root protege reglas y consistencia. Evans enfatiza que los invariantes deben mantenerse al confirmar cambios en el agregado. 
- **Invariants**: reglas que siempre deben cumplirse (p. ej., “no se puede activar una suscripción sin pago confirmado”).
- **Repository**: colección orientada al dominio para recuperar/guardar agregados (abstracción, no necesariamente “DAO”).
- **Domain Service**: lógica de dominio que no encaja naturalmente en una entidad/VO.
- **Domain Events**: eventos del dominio (“LessonPurchased”, “SubscriptionActivated”) para desacoplar reacciones.

Un resumen moderno y accesible de estos bloques (entidades, VOs, servicios, agregados, repositorios) también se encuentra en material académico abierto. 

------

### 4.4.3 Cómo encajan DDD y Hexagonal (lo más importante)

#### Regla práctica

- **DDD** te dice *qué modelar* y *cómo pensar el dominio*.
- **Hexagonal** te dice *cómo estructurar el software* para que ese dominio quede protegido de detalles externos.

#### En un diseño sólido:

- El **Dominio DDD** vive en el **Core** (sin frameworks).
- Los **Use Cases** viven como **Inbound Ports** (interfaces) + **Application Services** (implementaciones).
- Persistencia, mensajería y APIs externas son **Outbound Adapters** implementando **Outbound Ports**.

Esto hace que el modelo DDD sea **portable** y **testeable**, y que la infraestructura sea reemplazable.

## 4.5 Mapeo típico en un backend Java (estructura mental)

### A. Core (sin Spring)

- **domain/**
  - aggregates, entities, valueobjects
  - domain services
  - domain events
  - políticas e invariantes (métodos del agregado)
- **application/**
  - inbound ports (interfaces de casos de uso)
  - application services (implementación de casos de uso)
  - DTOs de aplicación (commands/queries) si aplica
  - outbound ports (interfaces para persistencia e integraciones)

### B. Adapters (con Spring)

- **adapters/in/**
  - REST controllers / consumers / schedulers
  - mappers de HTTP ↔ command/query
- **adapters/out/**
  - persistence: JPA entities + Spring Data repositories + mapper a dominio
  - clients: Feign/WebClient, SDKs
  - messaging producers

### C. Infrastructure / config

- configuración Spring (beans), wiring, perfiles, etc.

------

> [!IMPORTANT]
>
> 1. **El dominio no conoce frameworks**
>     Nada de `@Entity`, `@Transactional`, `JpaRepository` en `domain/`.
>
> 2. **El repositorio del dominio es un puerto**
>     En el core defines `CourseRepository` (interface). En infraestructura lo implementas con JPA/SQL.
>
> 3. **Los agregados protegen invariantes**
>     No “valides todo” solo en controladores. Las reglas críticas viven en el agregado o en domain services. 
>
> 4. **Los controladores son adaptadores, no “lógica”**
>     Hacen: parseo, autenticación/autorización, mapping, llamada al caso de uso, y respuesta.
>
> 5. **Pruebas por niveles**
>
>    - Unit tests al dominio (sin mocks de framework).
>
>    - Tests a casos de uso (mock de outbound ports).
>
>    - Integration tests para adaptadores (DB real, wiremock, etc.).

**🗂️ Estructura esperada del proyecto**

```
/project-root
 ├── pom.xml
 ├── README.md
 └── src/main/java/com/example/project
     ├── domain
     │   ├── model
     │   		├── aggregates
     │   		├── valueobject
     │   ├── repositories
     │   └── exceptions
     │   └── events
     ├── application
     │   ├── config
     │   └── dtos
     │   └── exceptions
     │   └── mappers
     │   └── ports
     │   └── usecases
     ├── infrastructure
             └── adapters
                 ├── inbound
                 │   └── controller
                 │   └── exceptionhandler
                 │   └── dtos
                 └── outbound
                     └── persistence
                            └── entities
                            └── mappers
                            └── repositories
```

### 4.5.1 Creación de proyecto Aplicando Hexagonal+DDD y Modular

🛠️ Prerrequisitos en VS Code

**Extensiones necesarias**:

- ✅ [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- ✅ Maven for Java
- ✅ Spring Boot Extension Pack (opcional pero útil)

**Instalaciones previas**:

- Java JDK 17 o superior
- Maven (`mvn -v` desde terminal debe funcionar)
- VS Code configurado para compilar Java

#### 🧱 Crear el proyecto padre

📌 Pasos:

1. Abre **Visual Studio Code**

2. Abre el **Command Palette**: `Ctrl+Shift+P` → `Java: Create Java Project`

3. Selecciona `Maven`

4. Selecciona una carpeta vacía, por ejemplo `miapp`

5. Llena los campos:

   - Group ID: `com.miempresa`
   - Artifact ID: `miapp`
   - Version: `1.0.0-SNAPSHOT`
   - Packaging: `pom`

6. VS Code te generará un proyecto padre (`pom.xml`) . Abra el pom y pegue el siguiente codigo

   > [!NOTE]
   >
   > Agregar despues de <version>1.0.0-SNAPSHOT</version>
   >
   > <packaging>pom</packaging>

   > [!NOTE]
   >
   > Reemplazar
   >
   > ```
   > <properties>
   > 	<maven.compiler.source>17</maven.compiler.source>
   > 	<maven.compiler.target>17</maven.compiler.target>
   > </properties>
   > ```
   >
   > por
   >
   > ```
   >   <properties>
   >         <java.version>17</java.version>
   >         <maven.compiler.source>17</maven.compiler.source>
   >         <maven.compiler.target>17</maven.compiler.target>
   >         <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   >         <spring-boot.version>3.2.2</spring-boot.version>
   >   </properties>
   >   <dependencyManagement>
   >     <dependencies>
   >       <dependency>
   >         <groupId>org.springframework.boot</groupId>
   >         <artifactId>spring-boot-dependencies</artifactId>
   >         <version>${spring.boot.version}</version>
   >         <type>pom</type>
   >         <scope>import</scope>
   >       </dependency>
   >     </dependencies>
   >   </dependencyManagement>
   >   <build>
   >     <pluginManagement>
   >       <plugins>
   >         <plugin>
   >           <groupId>org.springframework.boot</groupId>
   >           <artifactId>spring-boot-maven-plugin</artifactId>
   >         </plugin>
   >         <plugin>
   >           <groupId>io.takari</groupId>
   >           <artifactId>maven-wrapper-plugin</artifactId>
   >           <version>3.1.1</version>
   >           <executions>
   >             <execution>
   >               <goals>
   >                 <goal>wrapper</goal>
   >               </goals>
   >             </execution>
   >           </executions>
   >         </plugin>
   >       </plugins>
   >     </pluginManagement>
   >   </build>
   > ```
   >
   > 

   

#### 📦 Crear los submódulos (`domain`, `application`, `infrastructure`)

1. Haga clic derecho en el espacio vacío del explorador de proyectos de visual studio code y en el menu emergente seleccione maven>new module

2. El asistente guía solicita que se seleccione el proyecto padre

   <img src="https://i.ibb.co/YTKDdKmK/image.png" style="zoom: 67%;" />

3. Posteriormente solicita que se ingrese el nombre del modulo a crear para el ejemplo ingresamos **domain**

   <img src="https://i.ibb.co/1DLcJp7/image.png" style="zoom:67%;" />

4. Repetimos estos mismos pasos para application e infrastructure.

5. Buscamos en cada proyecto creado src/main/java/com.bkseducate y eliminamos el archivo **Main**

#### **🚀 Modifique actualizando pom de Infrastructure**

Agregue el siguiente codigo

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.bkseducate</groupId>
            <artifactId>application</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
        </plugins>
    </build>
```

despues de:

```xml
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
```

#### **🚀 Agregar clase `MiappApplication.java` (main class)**

1. En infraestructura haga click (+) en el GroupID y seleccione crear paquete. Y llámelo infrastructure

   <img src="https://i.ibb.co/vCw80Byh/image.png" style="zoom:67%;" />

   ![](https://i.ibb.co/Xfh7JLHy/image.png)

   > [!IMPORTANT]
   >
   > Repita estos mismos pasos para cada submodulo (domain y Aplication)

2. Seleccione el paquete com.bkseducate.infrastructure y haga clic en el (+) y seleccione la opcion class y llamela MiappApplication

   > [!NOTE]
   >
   > Reemplace
   >
   > ```java
   > public class MiappApplication {
   > 
   > }
   > ```
   >
   > Por
   >
   > ```java
   > import org.springframework.boot.SpringApplication;
   > import org.springframework.boot.autoconfigure.SpringBootApplication;
   > 
   > @SpringBootApplication(scanBasePackages = "com.bkseducate")
   > public class MiappApplication {
   >     public static void main(String[] args) {
   >         SpringApplication.run(MiappApplication.class, args);
   >     }
   > }
   > ```

#### **🚀 Agregar dependencia entre módulos**

##### 🧠  `application/pom.xml`

Este módulo representa los **casos de uso**, y **depende del dominio**.

```xml
  <dependencies>
    <dependency>
      <groupId>com.bkseducate</groupId>
      <artifactId>domain</artifactId>
      <version>1.0.0-SNAPSHOT</version>
    </dependency>
  </dependencies>
```

##### 🌐 3. `infrastructure/pom.xml`

Este módulo representa la infraestructura: base de datos, controladores REST, main app. **Depende de `application` (que ya depende de `domain`)**.

```xml
<!-- Dependencia a la capa de aplicación -->
<dependency>
  <groupId>com.bkseducate</groupId>
  <artifactId>application</artifactId>
  <version>${project.version}</version>
</dependency>
</dependencies>
<dependency>
    <groupId>com.bksline.lms</groupId>
    <artifactId>domain</artifactId>
    <version>${project.version}</version>
</dependency>
```

### 4.5.2 Creación del archivo application.yml

Es una alternativa más legible a `application.properties` para configurar propiedades de Spring Boot. Permite organizar la configuración **por niveles jerárquicos** usando indentación (espacios).

🎯 Ejemplo simple de `application.yml`

```
server:
  port: 8080

spring:
  datasource:
    url: jdbc:h2:mem:demo
    username: sa
    password:
```

🚀 ¿Cómo crear variantes por entorno? (`dev`, `prod`, etc.)

Spring Boot permite tener múltiples archivos de configuración como:

- `application.yml` → config común
- `application-dev.yml` → solo para desarrollo
- `application-prod.yml` → solo para producción

Y activa uno u otro según el **perfil activo**.

------

🗂️ Estructura de archivos recomendada

```
src/
└── main/
    └── resources/
        ├── application.yml
        ├── application-dev.yml
        └── application-prod.yml
```

------

🔄 Cómo activar un perfil (`dev`, `prod`, etc.)

Hay varias formas:

1. En `application.yml` (nivel base):

```
spring:
  profiles:
    active: dev
```

> Esto activará automáticamente `application-dev.yml`.

Parametros de conexion a Mysql

```
  datasource:
    url: jdbc:mysql://localhost:3306/myhexports
    username: produser
    password: prodpass
    driver-class-name: com.mysql.cj.jdbc.Driver

  jpa:
    hibernate:
      ddl-auto: validate
    show-sql: false
    properties:
      hibernate:
        format_sql: false
```

Parametros de conexion a Postgres

```
  # Database Configuration - PostgreSQL
  datasource:
    url: jdbc:postgresql://localhost:5432/bkslmsdb
    username: postgres
    password: 1234
    driver-class-name: org.postgresql.Driver
  
  # JPA Configuration
  jpa:
    hibernate:
      ddl-auto: validate  # Flyway maneja el esquema
    show-sql: true
    properties:
      hibernate:
        "[format_sql]": true
        dialect: org.hibernate.dialect.PostgreSQLDialect
```

Configuración Flyway

```
  # Flyway Configuration
  flyway:
    enabled: true
    locations: classpath:db/migration
    baseline-on-migrate: true
    baseline-version: 0
    # Deshabilitar validación temporalmente para permitir que se ejecuten las nuevas migraciones
    # Después de ejecutar REPAIR_CHECKSUMS.sql, cambiar esto a true
    validate-on-migrate: false
```

Configuracion para carga de archivos

```
# Media Storage Configuration
media:
  storage:
    # Configuración para almacenamiento local (usado si external.server-url no está configurado)
    base-path: ./uploads  # Ruta base para almacenar archivos multimedia (relativa al directorio de ejecución)
    
    # Configuración para servidor externo (descomentar y configurar para usar servidor externo)
    # external:
    #   server-url: http://localhost:8081/api/files  # URL del servidor externo de almacenamiento
    #   api-key: your-api-key-here  # API key opcional para autenticación con el servidor externo
```



## 4.3 Asociaciones(Relaciones)

@ManyToOne

@OneToMany

@OneToOne

@ManyToMany

### 4.3.1 **@ManyToOne**

- **Descripción**: Representa una relación en la que muchos instancias de una entidad están relacionadas con una instancia de otra entidad. Es la parte "muchos" de una relación de uno a muchos.
- **Uso**: Se usa para definir una relación de muchos a uno en una entidad.

```java
@Entity
public class Empleado {
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
}
```

Entidades:

- `Categoria`
- `Producto`

Relación:

- Una **categoría** puede tener muchos productos
- Un **producto** pertenece a **una sola categoría**

------

**Entidad `Categoria` (lado “uno”)**

```java
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public Categoria() {}
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
```

> [!IMPORTANT]
>
> - Esta entidad **no necesita conocer a Producto**
> - Es común mantenerla simple (aggregate root en DDD)

**Entidad `Producto` con `@ManyToOne` (lado “muchos”)**

```java
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Producto() {}

    public Producto(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
```

------

**Explicación detallada de `@ManyToOne`**

```
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "categoria_id", nullable = false)
private Categoria categoria;
```

`@ManyToOne`

- Define la relación **muchos → uno**
- Hibernate sabe que esta entidad contiene la **clave foránea**

`fetch = FetchType.LAZY`

- La categoría **no se carga inmediatamente**
- Se recupera solo cuando se accede a `producto.getCategoria()`
- Mejora rendimiento

`@JoinColumn`

- `name`: nombre de la columna FK en la tabla `productos`
- `nullable = false`: obliga a que todo producto tenga categoría

### 4.3.2 **@OneToMany**

- **Descripción**: Representa una relación en la que una instancia de una entidad está relacionada con muchas instancias de otra entidad. Es la parte "uno" de una relación de uno a muchos.
- **Uso**: Se usa para definir una relación de uno a muchos en una entidad.

```java
@Entity
public class Departamento {
        @OneToMany(mappedBy = "departamento")
        private List<Empleado> empleados;
}
```

Desde el punto de vista del modelo relacional:

- Una fila en la tabla **padre** puede estar asociada a **muchas filas** en la tabla **hija**
- La **clave foránea** se ubica en la tabla del lado *many*

Ejemplo típico:

- Un **Curso** tiene muchas **Clases**
- Una **Orden** tiene muchos **Ítems**
- Un **Cliente** tiene muchos **Pedidos**

------

**Escenario del ejemplo**

Se modelará la relación:

> **Curso (1) → Clase (N)**

- Un curso puede contener múltiples clases
- Cada clase pertenece a un único curso

------

**Entidad del lado MANY (Clase)**

```java
import jakarta.persistence.*;

@Entity
@Table(name = "clases")
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    protected Clase() {
    }

    public Clase(String titulo, Curso curso) {
        this.titulo = titulo;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Curso getCurso() {
        return curso;
    }
}
```

Puntos clave

- `@ManyToOne` **define la clave foránea**
- `@JoinColumn` crea la columna `curso_id`
- Esta es la **entidad propietaria** de la relación

------

**Entidad del lado ONE (Curso)**

```java
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "curso",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Clase> clases = new ArrayList<>();

    protected Curso() {
    }
    public Curso(String nombre) {
        this.nombre = nombre;
    }
    public void agregarClase(Clase clase) {
        clases.add(clase);
        clase.setCurso(this);
    }
    public void removerClase(Clase clase) {
        clases.remove(clase);
        clase.setCurso(null);
    }
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Clase> getClases() {
        return clases;
    }
}
```

⚠️ Para que el ejemplo sea completo, se debe añadir el setter:

```
public void setCurso(Curso curso) {
    this.curso = curso;
}
```

------

**Explicación de `@OneToMany` (línea por línea)**

```
@OneToMany(
    mappedBy = "curso",
    cascade = CascadeType.ALL,
    orphanRemoval = true
)
```

**`mappedBy = "curso"`**

- Indica que **la relación está mapeada por el atributo `curso`**
- Evita la creación de una tabla intermedia
- Define esta entidad como **lado inverso**

------

**`cascade = CascadeType.ALL`**

Propaga operaciones:

| Operación en Curso | Impacto en Clase |
| ------------------ | ---------------- |
| persist            | persist          |
| remove             | remove           |
| merge              | merge            |

------

**`orphanRemoval = true`**

- Si una clase se elimina de la colección Y no está asociada a otro curso Hibernate elimina el registro automáticamente

#### 4.3.2.1 **Relación OneToMany Bidireccional**

Una relación bidireccional OneToMany (Uno a Muchos) en JPA (Java Persistence API) es una relación en la que una entidad tiene una colección de otra entidad, y esa otra entidad tiene una referencia de vuelta a la primera entidad. En otras palabras, ambas entidades están conscientes de la relación y pueden navegar a través de ella en ambas direcciones.  

**En la entidad Padre se debe agregar la siguiente estructura:**

```java
@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
@JsonManagedReference
private Set<Chapter> chapter = new HashSet<>();
```

> [!TIP]
>
> **`@OneToMany`**: Indica que es una relación de "uno a muchos", donde un solo objeto de la entidad actual (por ejemplo, `Parent`) tiene múltiples objetos relacionados (en este caso, `Child`).
>
> **`mappedBy = "survey"`**: El parámetro `mappedBy` indica el **lado inverso de la relación**, o sea, la propiedad en la entidad `Chapter` que mapea esta relación. Esto significa que en la entidad `Chapter`, hay una propiedad llamada `survey` que establece la relación con `Survey`. Básicamente, `Chapter` contiene una referencia a `Survey`.
>
> **`cascade = CascadeType.ALL`**: Esto especifica el tipo de operaciones de cascada que deben aplicarse a las entidades relacionadas. `CascadeType.ALL` indica que cualquier operación (como `persist`, `merge`, `remove`, `refresh`) realizada sobre la entidad `Survey` se aplicará también a las entidades `Chapter` relacionadas. Por ejemplo, si se guarda o elimina un `Survey`, todos los `Chapter` asociados también serán guardados o eliminados.
>
> **`Set<Chapter> chapter = new HashSet<>()`**: Esto define una colección de capítulos (`Chapter`) relacionados con esta entidad `Survey`. Estamos utilizando un `Set` para evitar elementos duplicados.

**`@JsonManagedReference`**:

Esta es una anotación de **Jackson** que se utiliza para gestionar la serialización JSON en relaciones bidireccionales, evitando problemas de **recursión infinita** al serializar las entidades.

**En la entidad Hija se debe agregar**

```java
@ManyToOne
@JoinColumn(name = "survey_id")
@JsonBackReference
Survey survey;
```

### 4.3.3 **`@ManyToOne`**

La anotación `@ManyToOne` indica una relación de **muchos a uno** entre dos entidades. En este caso, una entidad (probablemente `Chapter`) tiene una relación con una entidad `Survey`. La relación de "muchos a uno" significa que **muchos objetos** de la entidad `Chapter` pueden estar asociados con **una sola** encuesta (`Survey`).

- **Relación bidireccional**: En este contexto, un `Chapter` pertenece a una `Survey`, y una `Survey` puede estar asociada con muchos `Chapter`. Esta es la relación inversa a la que tienes en la otra entidad (`Survey`).

> [!NOTE]
>
> La anotación **`@ManyToOne`** se utiliza cuando **muchas instancias de una entidad** están asociadas a **una sola instancia de otra entidad**.

> [!IMPORTANT]
>
> Muchas filas de una tabla apuntan a una sola fila de otra tabla mediante una clave foránea.

> [!TIP]
>
> Ejemplo típico:
>
> - Muchos **productos** pertenecen a una sola **categoría**
> - Muchas **clases** pertenecen a un solo **curso**
> - Muchos **empleados** pertenecen a un solo **departamento**

#### Ejemplo práctico: Producto → Categoría

#### Escenario

- Un **Producto** pertenece a **una Categoría**
- Una **Categoría** puede tener **muchos Productos**

------

**Entidad `Categoria`**

```
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    private Long id;
    private String nombre;

    public Categoria() {
    }

    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
```

------

**Entidad `Producto` usando `@ManyToOne`**

```
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    private Long id;

    private String nombre;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Long id, String nombre, double precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
```

------

**¿Qué hace exactamente `@ManyToOne`?**

```
@ManyToOne
@JoinColumn(name = "categoria_id")
```

#### Explicación técnica

| Elemento       | Función                             |
| -------------- | ----------------------------------- |
| `@ManyToOne`   | Indica la relación muchos → uno     |
| `@JoinColumn`  | Define la columna FK en la tabla    |
| `categoria_id` | Clave foránea hacia `categorias.id` |

### 4.3.4 **@OneToOne**

- **Descripción**: Representa una relación en la que una instancia de una entidad está relacionada con una única instancia de otra entidad.
- **Uso**: Se usa para definir una relación uno a uno en una entidad.

> [!TIP]
>
> En términos relacionales:
>
> > **Una fila de una tabla se relaciona con exactamente una fila de otra tabla.**

Ejemplos típicos:

- Un **Usuario** tiene un solo **Perfil**
- Una **Persona** tiene un solo **Documento de Identidad**
- Un **Empleado** tiene un solo **Contrato**

#### Ejemplo práctico: Usuario ↔ Perfil

##### Escenario

- Cada **Usuario** tiene **un Perfil**
- Cada **Perfil** pertenece a **un solo Usuario**

------

**1) Entidad `Usuario` (lado propietario)**

```
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private Long id;

    private String username;

    @OneToOne
    @JoinColumn(name = "perfil_id", unique = true)
    private Perfil perfil;

    public Usuario() {}

    public Usuario(Long id, String username, Perfil perfil) {
        this.id = id;
        this.username = username;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Perfil getPerfil() {
        return perfil;
    }
}
```

¿Por qué este es el **lado propietario**?

- Contiene la **clave foránea (`perfil_id`)**
- Controla la relación en base de datos

------

**2) Entidad `Perfil` (lado inverso)**

```java
import jakarta.persistence.*;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    private Long id;
    private String email;
    
    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

    public Perfil() {}

    public Perfil(Long id, String email) {
        this.id = id;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
```

**`mappedBy`**

- Indica que **Perfil no controla la relación**
- Evita la creación de una segunda columna FK
- La relación queda centralizada en `Usuario`

### 4.3.5 Asociación @ManyToMany (Llaves compuestas)

> [!TIP]
>
> Una relación **`@ManyToMany`** implica que:
>
> > **Muchas instancias de una entidad se relacionan con muchas instancias de otra entidad.**

Ejemplos típicos:

- Estudiantes ↔ Cursos
- Usuarios ↔ Roles
- Productos ↔ Órdenes

Cuando esta relación **requiere atributos propios** (por ejemplo: fecha de inscripción, estado, calificación), **no debe modelarse como un `@ManyToMany` simple**. En su lugar, se introduce una **entidad intermedia** con **llave primaria compuesta**.

> [!CAUTION]
>
> 📌 **Regla clave**
>
> Si la tabla intermedia tiene columnas adicionales, el `@ManyToMany` directo es incorrecto.

> [!IMPORTANT]
>
> **`@Embeddable`**:
>
> La anotación `@Embeddable` indica que esta clase puede ser **incrustada** en otra entidad como parte de su clave primaria. Es decir, esta clase será utilizada como una **clave compuesta** en una entidad que involucra una relación Many-to-Many entre `Estudiante` y `Curso`.
>
> En este caso, `EstudianteCursoId` representa una clave compuesta con los atributos `estudianteId` y `cursoId`, que combinados, identifican de manera única un registro en la tabla intermedia que vincula `Estudiante` y `Curso`.

> [!IMPORTANT]
>
> **Implementación de `Serializable`**:
>
> La clase `InscripcionId` implementa la interfaz `Serializable`. Esto es necesario porque JPA requiere que las clases que representan claves compuestas sean serializables. La serialización permite convertir un objeto en una secuencia de bytes, que puede ser almacenada o transmitida y luego reconstruida.
>
> - **`estudianteId`**: La clave primaria de la entidad `Estudiante`.
> - **`cursoId`**: La clave primaria de la entidad `Curso`.

> [!IMPORTANT]
>
> **JPA usará estos dos campos para generar la clave compuesta en la entidad que los use como clave primaria.**

> [!IMPORTANT]
>
> **Métodos `equals` y `hashCode`**:
>
> Estos dos métodos son fundamentales en cualquier clase que represente una clave compuesta, ya que JPA utiliza estos métodos para comprobar la igualdad y gestionar correctamente las entidades en un contexto de persistencia.
>
> `Objects.equals` compara los valores de `estudianteId` y `cursoId` entre dos instancias de `EstudianteCursoId`.
>
> **`hashCode`**:
>
> El método `hashCode` genera un código hash para la instancia de `EstudianteCursoId`, basado en `estudianteId` y `cursoId`. JPA utiliza este código hash para optimizar operaciones de almacenamiento en caché y búsqueda.
>

> [!TIP]
>
> `@EmbeddedId`
>
> La anotación **`@EmbeddedId`** se utiliza en **JPA/Hibernate** para indicar que la **clave primaria de una entidad está compuesta por múltiples atributos**, los cuales se agrupan en una **clase embebida**.
>
> En términos formales:
>
> > **`@EmbeddedId` permite definir una clave primaria compuesta utilizando un objeto de valor (`@Embeddable`).**
>
> ------
>
> ¿Por qué existe `@EmbeddedId`?
>
> En modelos relacionales reales, no todas las tablas pueden identificarse con una sola columna.
>  Ejemplos frecuentes:
>
> - Inscripciones `(estudiante_id, curso_id)`
> - Detalles de factura `(factura_id, producto_id)`
> - Históricos `(entidad_id, fecha)`
>
> JPA no permite múltiples `@Id` simples sin una estrategia explícita.`@EmbeddedId` resuelve este problema **de forma tipada y estructurada**.

#### Escenario de ejemplo: Estudiante ↔ Curso (con entidad intermedia)

##### Requerimiento

- Un **Estudiante** puede inscribirse en muchos **Cursos**
- Un **Curso** puede tener muchos **Estudiantes**
- La inscripción tiene atributos:
  - fechaInscripcion
  - estado

Esto exige una **entidad de asociación** con **llave compuesta**.

------

**Entidades principales**

**Entidad `Estudiante`**

```java
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "estudiante")
    private Set<Inscripcion> inscripciones;
}
```

------

**Entidad `Curso`**

```java
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private Long id;

    private String titulo;

    @OneToMany(mappedBy = "curso")
    private Set<Inscripcion> inscripciones;
}
```

> [!IMPORTANT]
>
> 📌 Obsérvese que **no existe `@ManyToMany` directo** entre `Estudiante` y `Curso`.

------

**2) Llave primaria compuesta (`@Embeddable`)**

La clave compuesta está formada por:

- `estudiante_id`
- `curso_id`

```java
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InscripcionId implements Serializable {

    private Long estudianteId;
    private Long cursoId;

    public InscripcionId() {}

    public InscripcionId(Long estudianteId, Long cursoId) {
        this.estudianteId = estudianteId;
        this.cursoId = cursoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InscripcionId)) return false;
        InscripcionId that = (InscripcionId) o;
        return Objects.equals(estudianteId, that.estudianteId) &&
               Objects.equals(cursoId, that.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudianteId, cursoId);
    }
}
```

📌 `equals` y `hashCode` **son obligatorios** para llaves compuestas.

------

**3) Entidad intermedia `Inscripcion`**

```java
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inscripciones")
public class Inscripcion {

    @EmbeddedId
    private InscripcionId id;

    @ManyToOne
    @MapsId("estudianteId")
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @MapsId("cursoId")
    @JoinColumn(name = "curso_id")
    private Curso curso;

    private LocalDate fechaInscripcion;

    private String estado;
}
```

**Explicación clave**

| Elemento      | Función                                               |
| ------------- | ----------------------------------------------------- |
| `@EmbeddedId` | Declara la PK compuesta                               |
| `@MapsId`     | Vincula la FK con la PK                               |
| `@ManyToOne`  | Cada inscripción pertenece a un estudiante y un curso |
| `Inscripcion` | Se convierte en **Aggregate Root de la relación**     |

### 4.3.6 @JoinTable

La anotación `@JoinTable` en JPA se utiliza para definir la tabla de unión que se emplea en relaciones muchos a muchos (Many-to-Many) o en relaciones uno a muchos (One-to-Many) donde se desea personalizar la tabla intermedia y las columnas de la relación. Esta anotación proporciona un control detallado sobre cómo se gestionan las uniones entre las tablas en una base de datos relacional.

> [!IMPORTANT]
>
> `@JoinTable` es la anotación que:
>
> - Define el **nombre de la tabla intermedia**
> - Declara las **claves foráneas** hacia ambas entidades
> - Controla la estructura del join sin crear una entidad explícita

#### 4.2.6.1 `@JoinTable` en Relaciones Muchos a Muchos

Ejemplo práctico: Estudiante ↔ Curso (ManyToMany simple)

**Escenario**

- Un **Estudiante** puede estar en muchos **Cursos**
- Un **Curso** puede tener muchos **Estudiantes**
- La tabla intermedia **no tiene atributos adicionales**

Este es el **caso correcto** para usar `@ManyToMany` + `@JoinTable`.

------

1) Entidad `Estudiante` (lado propietario)

```java
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    private Long id;

    private String nombre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "estudiante_curso",
        joinColumns = @JoinColumn(name = "estudiante_id"),
        inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private Set<Curso> cursos;
}
```

Detalles clave

- `name`: nombre real de la tabla intermedia
- `joinColumns`: FK que apunta a **Estudiante**
- `inverseJoinColumns`: FK que apunta a **Curso**
- Este es el **lado propietario** de la relación

------

2) Entidad `Curso` (lado inverso)

```java
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private Long id;

    private String titulo;

    @ManyToMany(mappedBy = "cursos", fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantes;
}
```

**`mappedBy`**

- Indica que `Curso` **no controla la relación**
- Evita la creación de una segunda tabla intermedia
- La relación queda centralizada en `Estudiante`

> [!IMPORTANT]
>
> **Beneficios reales de `LAZY`**
>
> - Evita consultas innecesarias
> - Reduce el tamaño de los resultados
> - Previene el problema de **carga excesiva de datos**
> - Es esencial en sistemas medianos y grandes (LMS, ERP, CRM)
>
> 📌 **Buenas prácticas profesionales** recomiendan:
>
> > ```
> > @ManyToMany` → siempre `LAZY
> > ```

#### 4.3.6.2 Uso de `@JoinTable` en Relaciones Uno a Muchos

**¿Qué hace `@JoinTable` en `@OneToMany`?**

`@JoinTable` define explícitamente:

- Una **tabla intermedia**
- Una FK hacia la entidad “uno”
- Una FK hacia la entidad “muchos”

```java
@OneToMany
@JoinTable(
    name = "tabla_union",
    joinColumns = @JoinColumn(name = "id_uno"),
    inverseJoinColumns = @JoinColumn(name = "id_muchos")
)
```

Esto implica que:

La tabla “muchos” no contiene la FK. La relación queda externalizada en la tabla de unión

Ejemplo práctico: Pedido → Producto (OneToMany con JoinTable)

Escenario

- Un **Pedido** tiene muchos **Productos**
- Un **Producto** puede existir independientemente del Pedido
- No se desea modificar la tabla `productos` con una FK

------

Entidad `Pedido` (lado propietario)

```java
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    private Long id;
    private String numero;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "pedido_producto",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private Set<Producto> productos;
}
```

------

Entidad `Producto`

```java
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    private Long id;
    private String nombre;
    private double precio;
}
```

> [!IMPORTANT]
>
> Enfoque con `@JoinTable`
>
> ✔️ Ventajas:
>
> - No altera la tabla “muchos”
> - Útil cuando la tabla es compartida
> - Útil con esquemas heredados
>
> ❌ Desventajas:
>
> - Tabla adicional
> - Más joins
> - Mayor complejidad
> - Menor rendimiento

> [!IMPORTANT]
>
> ¿Cuándo usar `@JoinTable` en OneToMany?
>
> ✔️ **Uso válido cuando:**
>
> - Se trabaja con **bases de datos legadas**
> - La tabla “muchos” **no puede modificarse**
> - La relación es opcional o contextual
> - Se desea desacoplar completamente las entidades
>
> ❌ **No usar cuando:**
>
> - Se diseña un modelo nuevo
> - Se busca simplicidad
> - El rendimiento es crítico
> - Se sigue DDD estrictamente

