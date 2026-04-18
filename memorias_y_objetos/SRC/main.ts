import Dog from "./models/Dog";
import User from "./models/User";
import Config from "./models/Config";

// Instancias distintas
const dog1 = new Dog("Rex");
const dog2 = new Dog("Rex");
console.log("dog1 === dog2:", dog1 === dog2); // false

// Usuarios
const user1 = new User("Ana");
const user2 = new User("Ana");
console.log("user1.name:", user1.name, "user2.name:", user2.name);

// Singleton
const c1 = Config.getInstance("http://localhost", 3000);
const c2 = Config.getInstance("http://localhost", 3000);
console.log("c1 === c2:", c1 === c2); // true

// Bonus: memoria en Node.js
console.log(process.memoryUsage());
