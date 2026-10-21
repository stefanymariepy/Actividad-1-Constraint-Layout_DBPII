# Actividad 1: Layout Complejo en Jetpack Compose

Este proyecto implementa una interfaz de usuario responsiva en Android utilizando **Jetpack Compose** y **Kotlin**. El objetivo es dominar la distribución de elementos con pesos (`weight`) y el control de márgenes con `Spacer`.

## Descripción del Diseño
La interfaz organiza cuatro bloques de colores en una estructura vertical y horizontal perfectamente distribuida:

* **Bloque Superior:** Contenedor `Box` de color **Magenta** (`weight(1f)`).
* **Sección Central:** Un contenedor `Row` dividido equitativamente en dos bloques: **Amarillo** (izquierda) y **Azul** (derecha), ambos con `weight(1f)`.
* **Bloque Inferior:** Contenedor `Box` de color **Verde** (`weight(1f)`).
* **Espaciadores:** Separaciones simétricas de `30.dp` (tanto en vertical como en horizontal) utilizando el componente `Spacer`.

## Tecnologías
* **Lenguaje:** Kotlin
* **Framework:** Jetpack Compose (UI Declarativa)
* **IDE:** Android Studio

## Código Fuente
```kotlin
@Composable
fun MyComplexLayout(){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxSize().weight(1f).background(Color.Magenta))
        Spacer(modifier = Modifier.height(30.dp))
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(modifier= Modifier.weight(1f).fillMaxHeight().background(Color.Yellow))
            Spacer(modifier = Modifier.width(30.dp))
            Box(modifier= Modifier.weight(1f).fillMaxHeight().background(Color.Blue))
        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Green))
    }
}
```
