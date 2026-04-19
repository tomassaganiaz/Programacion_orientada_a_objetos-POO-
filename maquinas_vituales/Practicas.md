## Práctica

31. Escribí el comando para crear una carpeta llamada `proyecto_vm`.

32. Escribí el comando Linux para entrar en esa carpeta.

33. Escribí el comando para crear un archivo llamado `app.js`.

34. Escribí un Dockerfile mínimo usando Node.js.

35. Escribí un workflow de GitHub Actions que ejecute `npm install` y `npm test`.

---

31. Comando para crear carpeta proyecto_vm:

```bash

mkdir proyecto_vm

```

32. Comando Linux para entrar en esa carpeta:

```bash

cd proyecto_vm

```

33. Comando para crear archivo app.js:

```bash

touch app.js

```

34. Dockerfile mínimo usando Node.js:

```Dockerfile

FROM node:18
WORKDIR /app
COPY app.js .
CMD ["node", "app.js"]

```

35. Workflow de GitHub Actions que ejecute npm install y npm test:

```Yami

name: Node CI
on: push
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - uses: actions/setup-node@v3
        with:
          node-version: '18'
      - run: npm install
      - run: npm test

```
