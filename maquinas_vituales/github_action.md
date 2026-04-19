## GitHub Actions

21. ¿Qué es GitHub Actions?

22. ¿Para qué sirve un archivo YAML en GitHub Actions?

23. ¿En qué carpeta se guardan los workflows?

24. ¿Qué evento ejecuta un workflow cuando se hace push al repositorio?

25. ¿Qué hace la action `actions/checkout`?

26. ¿Qué hace la action `actions/setup-node`?

27. ¿Para qué sirve automatizar tests en CI/CD?

28. Escribí una estructura mínima de workflow con `push`.

29. ¿Qué ventaja tienen las runners efímeras?

30. ¿Qué pasaría si falla un test en el pipeline?

---

21. Es una plataforma de automatización CI/CD integrada en GitHub que permite ejecutar flujos de trabajo (workflows) en respuesta a eventos del repositorio.

22. Define los pasos, jobs y condiciones del workflow. Es la “receta” que indica qué hacer y cuándo.

23. Los workflows de GitHub Actions se guardan en la carpeta especial:

```codigo

.github/workflows/

```
.github/ - Es una carpeta reservada por GitHub para configuraciones del repositorio (issues templates, dependabot, actions, etc.).

workflows/ - Dentro de esta carpeta se colocan los archivos YAML que definen los flujos de trabajo (CI/CD).

Cada archivo YAML representa un workflow independiente. EJ:

ci.yml → pipeline de integración continua.

deploy.yml → pipeline de despliegue.

tests.yml → pipeline de pruebas automatizadas.

24. El evento que dispara el workflow es push

25. ¿Qué hace la action actions/checkout?  

- Clona el repositorio en el runner para que el workflow tenga acceso al código.

26. ¿Qué hace la action actions/setup-node?  

- Instala y configura Node.js en el runner.

27. Para asegurar calidad, detectar errores temprano y evitar que se despliegue código defectuoso.

28. Estructura mínima de workflow con push:

```yami

name: CI
on: push
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - run: echo "Hola CI"

```
29. ¿Qué ventaja tienen las runners efímeras?  

Se destruyen tras cada ejecución, evitando residuos y aumentando seguridad.

30. ¿Qué pasaría si falla un test en el pipeline?  

El pipeline se detiene y marca error, bloqueando el despliegue de código defectuoso.
