// ❌ Malas prácticas en JavaScript
// Usar objetos envoltorios en lugar de primitivos

const nombre = new String("Juan");
const apellido = new String("Perez");

const nombreCompleto = nombre + apellido;

const edad = new Number(30);
const activo = new Boolean(true);

console.log("Nombre completo:", nombreCompleto);
console.log("Edad:", edad);
console.log("Activo:", activo);
