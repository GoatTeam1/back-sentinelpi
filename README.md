# Sentinel-Pi Backend# Sentinel-Pi Backend

## Requisitos

- [Maven](https://maven.apache.org/) (`mvn`) o [Maven Daemon](https://mvnd.apache.org/) (`mvnd`)
- Java 17

## Comandos básicos

### Levantar el servidor en modo desarrollo

```bash
mvnd spring-boot:run
# o alternativamente
mvn spring-boot:run
```

### Generar el archivo JAR ejecutable

```bash
mvnd clean package
# o alternativamente
mvn clean package
```
El archivo JAR se generará en la carpeta `target/`.

### Ejecutar el JAR generado

```bash
java -jar target/sentinelpi-0.0.1-SNAPSHOT.jar
```

## Buenas prácticas de ramas y commits

- **Ramas:**  
  - Usa ramas descriptivas para cada feature, bugfix o tarea (ejemplo: `feature/login`, `bugfix/fix-port`, `hotfix/security-patch`).
  - Trabaja siempre en una rama distinta a `main` o `master`.
  - Haz merge a la rama principal solo cuando la funcionalidad esté probada.

- **Commits:**  
  - Escribe mensajes de commit claros y concisos.
  - Usa el imperativo en los mensajes (ejemplo: `Agrega endpoint de usuarios`).
  - Relaciona los commits con las tareas o issues correspondientes si es posible.

## Estructura del proyecto

- `src/main/java`: Código fuente principal
- `src/main/resources`: Archivos de configuración y recursos
- `src/test/java`: Pruebas unitarias

---

¡Recuerda mantener el código limpio y documentado!