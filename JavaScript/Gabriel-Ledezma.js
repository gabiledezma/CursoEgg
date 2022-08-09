// Propiedad intelectual: Esta prueba fue desarrollada por TCIT el año 2014 y registrada bajo propiedad intelectual, cualquier publicación o difamación podría estar sujeta a acciones legales. Hay otras empresas que nos han copiado esta prueba, no aceptes imitaciones, exige el original xD
// No realizar la prueba en repl.it al hacerlo su respuesta queda disponible para otros postulantes, tampoco subirla a repositorios de github públicos

// Sección de declaraciones, NO EDITAR

// Responsables de los cuarteles
const paddockManagers = [
  { id: 1, taxNumber: '132254524', name: 'JUAN TAPIA BURGOS'},
  { id: 2, taxNumber: '143618668', name: 'EFRAIN SOTO VERA'},
  { id: 3, taxNumber: '78903228', name: 'CARLOS PEREZ GONZALEZ'},
  { id: 4, taxNumber: '176812737', name: 'ANDRES VIÑALES CIENFUEGOS'},
  { id: 5, taxNumber: '216352696', name: 'OSCAR PEREZ ZUÑIGA'},
  { id: 6, taxNumber: '78684747', name: 'JOAQUIN ANDRADE SANDOVAL' }
];

// Tipo de cuartel, en el cual se utiliza el tipo de producto plantado
const paddockType = [
  { id: 1, name: 'PALTOS' },
  { id: 2, name: 'AVELLANOS' },
  { id: 3, name: 'CEREZAS' },
  { id: 4, name: 'NOGALES' },
]

// Un paddock representa un cuartel de un campo (Entiéndase también como potrero o parcela), el área está representada en m2, harvestYear es el año en el que se sembró el cuartel
const paddocks = [
  { paddockManagerId: 6, farmId: 1, paddockTypeId: 1, harvestYear: 2019, area: 1200 },
  { paddockManagerId: 1, farmId: 3, paddockTypeId: 4, harvestYear: 2019, area: 500 },
  { paddockManagerId: 5, farmId: 3, paddockTypeId: 2, harvestYear: 2020, area: 20000 },
  { paddockManagerId: 2, farmId: 2, paddockTypeId: 3, harvestYear: 2021, area: 8401},
  { paddockManagerId: 3, farmId: 1, paddockTypeId: 1, harvestYear: 2020, area: 2877 },
  { paddockManagerId: 5, farmId: 2, paddockTypeId: 2, harvestYear: 2017, area: 15902 },
  { paddockManagerId: 3, farmId: 3, paddockTypeId: 2, harvestYear: 2018, area: 1736 },
  { paddockManagerId: 2, farmId: 3, paddockTypeId: 3, harvestYear: 2020, area: 2965 },
  { paddockManagerId: 4, farmId: 3, paddockTypeId: 4, harvestYear: 2018, area: 1651 },
  { paddockManagerId: 5, farmId: 1, paddockTypeId: 1, harvestYear: 2018, area: 700 },
  { paddockManagerId: 1, farmId: 2, paddockTypeId: 1, harvestYear: 2019, area: 7956 },
  { paddockManagerId: 5, farmId: 3, paddockTypeId: 2, harvestYear: 2020, area: 3745 },
  { paddockManagerId: 6, farmId: 1, paddockTypeId: 3, harvestYear: 2021, area: 11362 },
  { paddockManagerId: 2, farmId: 3, paddockTypeId: 3, harvestYear: 2021, area: 300 },
  { paddockManagerId: 3, farmId: 2, paddockTypeId: 2, harvestYear: 2020, area: 19188 },
  { paddockManagerId: 3, farmId: 1, paddockTypeId: 1, harvestYear: 2019, area: 17137 },
  { paddockManagerId: 4, farmId: 3, paddockTypeId: 2, harvestYear: 2020, area: 100 },
  { paddockManagerId: 2, farmId: 1, paddockTypeId: 3, harvestYear: 2019, area: 11845 },
  { paddockManagerId: 5, farmId: 2, paddockTypeId: 1, harvestYear: 2018, area: 15969 },
  { paddockManagerId: 1, farmId: 3, paddockTypeId: 1, harvestYear: 2029, area: 10420 },
  { paddockManagerId: 5, farmId: 2, paddockTypeId: 3, harvestYear: 2010, area: 3200 },
  { paddockManagerId: 6, farmId: 1, paddockTypeId: 2, harvestYear: 2012, area: 10587 },
  { paddockManagerId: 2, farmId: 2, paddockTypeId: 2, harvestYear: 2018, area: 16750 }
];

const farms = [
  { id: 1, name: 'AGRICOLA SANTA ANA' },
  { id: 2, name: 'VINA SANTA PAULA' },
  { id: 3, name: 'FORESTAL Y AGRICOLA LO ENCINA' }
];

/*
  SECCIÓN PROBLEMAS
    - No promover la copia:
	  - No preguntar en StackOverflow, foros, o similares ya que estas preguntas/respuestas quedan disponibles a otros candidatos
	  - No subir a repositorios públicos (github, o similares)
	  - Otros sitios como codepen o editores de texto on-line (codepen, repl, o similares), dejan guardado el código, por lo que les pedimos tampoco usar editores on-line, la mejor forma de debuggear su código es usando un intérprete de javascript como node y ejecutarlo de manera local
	  - Para nosotros es fácil detectar pruebas con copia, no pierda su tiempo intentando hacerlo
	  - Posteriormente, se evaluará conocimiento en es6 en entrevistas presenciales
    - Las siguientes son preguntas básicas de Javascript y manejo de datos. Se evaluará eficiencia, ORDEN y claridad del código entregado.
    - Se debe programar un algoritmo para cada método y que este retorne lo requerido.
    - Debe usar nombres explicativos para sus variables.
    - Usar sintaxis ES6.
    - Los resultados son evaluados con un test automatizado, revise que sus retornos sean con la estructura de datos solicitada en cada pregunta.
	- Métodos menos verbosos, DRY, y buenas prácticas en el código mejoran el puntaje final de su prueba
	- Si necesita hacer supuestos que afecten las respuestas entregadas, por favor déjelos escritos en el cuerpo del correo cuando envíe su prueba (No en este archivo). Supuestos que contradigan lo solicitado, no serán considerados como válidos.
	- Su prueba debe ejecutarse sin errores con: node nombre-apellido.js
  - Su prueba debe ejecutarse sin errores en la consola del inspector de Google Chrome
*/

// Tip: Una hectárea equivale a 10.000m2

// 0 Arreglo con los ids de los responsables de cada cuartel
function listPaddockManagerIds() {
  return paddockManagers.map((paddockManager) => paddockManager.id);
}

// 1 Arreglo con los ruts de los responsables de los cuarteles, ordenados por nombre
function listPaddockManagersByName() {
  function SortArray(x, y){ // utilizo esta funcion para ordenar alfabeticamente los elementos del array
      return x.name.localeCompare(y.name);
  }
  const aux = paddockManagers.sort(SortArray); //guardo todo en un array auxiliar
  return aux.map((paddockManager) => paddockManager.taxNumber);
};

// 2 Arreglo con los nombres de cada tipo de cultivo, ordenados decrecientemente por la suma TOTAL de la cantidad de hectáreas plantadas de cada uno de ellos.
function sortPaddockTypeByTotalArea() {
  const auxAreas = []; // utilizo este array auxiliar para guardar la sumatoria de las areas
  for (let i = 0; i < paddockType.length; i++) { // recorro paddock type para agregar los valores, que necesito de ese array, en el array auxiliar
     auxAreas[i] = {paddockTypeId: paddockType[i].id, area: 0, name: paddockType[i].name};
  }
  paddocks.forEach(element =>{ // recorro paddocks para la sumatoria de areas
    switch (element.paddockTypeId) {
      case 1:
        auxAreas[0].area=(auxAreas[0].area+element.area)/10000;
        break;
      case 2:
        auxAreas[1].area=(auxAreas[1].area+element.area)/10000;
        break;
      case 3:
        auxAreas[2].area=(auxAreas[2].area+element.area)/10000;
        break;
      case 4:
        auxAreas[3].area=(auxAreas[3].area+element.area)/10000;
        break;
    } 
  });
  const aux = auxAreas.sort((a, b) => { // ordeno de forma decreciente la sumatoria total de areas 
    return b.area - a.area;
  });
return aux.map((paddockType) => paddockType.name);
}

// 3 Arreglo con los nombres de los administradores, ordenados decrecientemente por la suma TOTAL de hectáreas que administran.
function sortFarmManagerByAdminArea() {
  const original = paddockManagers.sort((a, b) => { // como el array paddock managers quedo con diferente orden, decidi reorganizarlo nuevamente por id
    return a.id - b.id;
  });
  const auxAreas = []; // utilizo este array auxiliar para guardar la sumatoria de las areas
  for (let i = 0; i < original.length; i++) {  // recorro el array auxiliar de paddock manager para agregar los valores, que necesito de ese array, en el array auxiliar de areas
    auxAreas[i] = {paddockManagerId: original[i].id, area: 0, name: original[i].name};
  }
  for (let i = 0; i < paddocks.length; i++) { // recorro paddocks para realizar las sumatorias de areas
    switch (paddocks[i].paddockManagerId) {
      case 1:
        auxAreas[0].area = (auxAreas[0].area + paddocks[i].area)/10000;
        break;
      case 2:
        auxAreas[1].area = (auxAreas[1].area + paddocks[i].area)/10000;
        break;
      case 3:
        auxAreas[2].area = (auxAreas[2].area + paddocks[i].area)/10000;
        break;
      case 4:
        auxAreas[3].area = (auxAreas[3].area + paddocks[i].area)/10000;
        break;
      case 5:
        auxAreas[4].area = (auxAreas[4].area + paddocks[i].area)/10000;
        break;
      case 6:
        auxAreas[5].area = (auxAreas[5].area + paddocks[i].area)/10000;
        break;
    } 
  }
  const aux2 = auxAreas.sort((a, b) => { // ordeno en un array auxiliar todos los valores segun su area en forma decreciente
    return b.area - a.area;
  });
  return aux2.map((paddockManager) => paddockManager.name);
}

// 4 Objeto en que las claves sean los nombres de los campos y los valores un arreglo con los ruts de sus administradores ordenados alfabéticamente por nombre.
function farmManagerNames() {
  const paddock2 = paddocks
  console.log(paddock2)
  const taxNumberPorId = {}
  paddockManagers.forEach(element => taxNumberPorId[element.id] = element.taxNumber )
  const auxiliar = paddock2.map(element2 => {
    const nuevo = {
        {taxNumber: taxNumberPorId[element2.paddockManagerId], {"farmId"= element2.farmId}, {"paddockTypeId"= element2.paddockTypeId}, {"harvestYear"= element2.harvestYear}, {"area" = element2.area};
    }
    return nuevo;
  });

console.log(auxiliar)
  const filtrado = {}
  for (let i = 0; i < farms.length; i++) {
    filtrado[i] = paddock2.filter((element) => { 
      if (element.farmId==(i+1)) {
          return element
      }
    });
  }
  for (let i = 0; i < farms.length; i++) {
    for (let j = 0; j < paddocksManagers.length; j++) {
      if (filtrado[i].paddockManagerId==paddocksManagers[j].id) {
      filtrado[i].paddockManagerId.push({"taxNumber": paddocksManagers[j].taxNumber})
      }
    }
  }
  const campos = [];
  for (let i = 0; i < farms.length; i++) {
    let name;
    switch (i) {
      case 0:
        campos.push({"AGRICOLA SANTA ANA": filtrado[i]})
        break;
      case 1:
        campos.push({"VINA SANTA PAULA": filtrado[i]})
        break;
      case 2:
        const count = campos.push({"FORESTAL Y AGRICOLA LO ENCINA": filtrado[i]})
        break;
    }
  }
  console.log(campos)
  filtrado[0].sort((a,b)=>{
    return a.taxNumber - b.taxNumber;
  });
  const aux = campos.sort((a, b) => { // ordeno en un array auxiliar todos los valores segun su area en forma decreciente
    return a.area - b.area;
  });
  return aux.map((paddockManager) => paddockManager.name);

}

// 5 Arreglo ordenado decrecientemente con los m2 totales de cada campo que tengan más de 2 hectáreas en Paltos
function biggestAvocadoFarms() {
  // CODE HERE
}

// 6 Arreglo con nombres de los administradores de la FORESTAL Y AGRÍCOLA LO ENCINA, ordenados por nombre, que trabajen más de 1000 m2 de Cerezas
function biggestCherriesManagers() {
  // CODE HERE
}

// 7 Objeto en el cual las claves sean el nombre del administrador y el valor un arreglo con los nombres de los campos que administra, ordenados alfabéticamente
function farmManagerPaddocks() {
  // CODE HERE
}

// 8 Objeto en que las claves sean el tipo de cultivo concatenado con su año de plantación (la concatenación tiene un separador de guión ‘-’, por ejemplo AVELLANOS-2020) y el valor otro objeto en el cual la clave sea el id del administrador y el valor el nombre del administrador
function paddocksManagers() {
  // CODE HERE
}

// 9 Agregar nuevo administrador con datos ficticios a "paddockManagers" y agregar un nuevo cuartel de tipo NOGALES con 900mts2, año 2017 de AGRICOLA SANTA ANA, administrado por este nuevo administrador
// Luego devolver el lugar que ocupa este nuevo administrador en el ranking de la pregunta 3.
// No modificar arreglos originales para no alterar las respuestas anteriores al correr la solución
function newManagerRanking() {
  // CODE HERE
}

// No modificar, eliminar o alterar cualquier línea de código o comentario de acá para abajo
// Cualquier cambio hará que su prueba quede invalidada automáticamente
console.log("Pregunta 0");
console.log(listPaddockManagerIds());
console.log("Pregunta 1");
console.log(listPaddockManagersByName());
console.log("Pregunta 2");
console.log(sortPaddockTypeByTotalArea());
console.log("Pregunta 3");
console.log(sortFarmManagerByAdminArea());
console.log("Pregunta 4");
console.log(farmManagerNames());
console.log("Pregunta 5");
console.log(biggestAvocadoFarms());
console.log("Pregunta 6");
console.log(biggestCherriesManagers());
console.log("Pregunta 7");
console.log(farmManagerPaddocks());
console.log("Pregunta 8");
console.log(paddocksManagers());
console.log("Pregunta 9");
console.log(newManagerRanking());
