# 🧠 Trabajo Práctico: Uso de Memoria en Objetos e Instancias

## 🎯 Objetivo
- Comprender cómo se crean objetos en memoria
- Diferenciar instancias vs valores primitivos
- Aplicar buenas prácticas para optimizar memoria
- Mostrar diferencias entre JavaScript (malas prácticas) y TypeScript (buenas prácticas)

---

## 📂 Organización del proyecto
- `src/models/` → Clases principales (`Dog`, `User`, `Config`)
- `src/examples/primitives.ts` → Buenas prácticas con primitivos en TypeScript
- `src/examples/badPractices.js` → Malas prácticas en JavaScript (objetos envoltorios)
- `src/main.ts` → Punto de entrada con pruebas
- `node/memoryUsage.ts` → Bonus: medición de memoria en Node.js
- `README.md` → Documentación del trabajo práctico

---

## ⚙️ Requerimientos

### Lenguaje y entorno
- **Node.js** ≥ 18.x (para ejecutar el código y usar `process.memoryUsage()`)
- **TypeScript** ≥ 5.x (para compilar los archivos `.ts`)

### Dependencias
Instalar con npm:
```bash
npm install typescript ts-node @types/node

▶️ Ejecución
Compilar TypeScript:

npx tsc

Ejecutar ejemplos:

Buenas prácticas (TS):

node dist/examples/primitives.js

Malas prácticas (JS):

node src/examples/badPractices.js

Main con instancias y Singleton:

node dist/main.js

Bonus Node.js (memoria):

node dist/node/memoryUsage.js
