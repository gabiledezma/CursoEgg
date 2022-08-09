let menuDelDia = {
  raviolesConSalsa: ["Harina", "Sal", "Huevos", "Aceite", "Peceto", "Ricota"],
  bagnaCauda: ["Ajo", "Anchoas", "Aceite", "Crema", "Papas", "Zanahorias"],
  tallarines: ["Harina", "Pollo", "ACeite", "Huevos", "Tomates", "Cebolla"],
};
function ingredienteEnMalEstado(menu, comida, ingrediente) {
  let indiceDeIngrediente="";
  for (let index = 0; index < menu.length; index++) {
    if ((menu[index] = comida)) {
      for (let j = 0; j < comida.length; j++) {
        if (ingrediente == comida[j]) {
          indiceDeIngrediente = j;
        }
      }
    }
  }
  if (indiceDeIngrediente == "") {
    console.log("El menú está perfecto");
  } else {
    
  }
}
