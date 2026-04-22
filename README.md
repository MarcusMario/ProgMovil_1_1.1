# Ejercicio 1 – Android TextToSpeech

## Descripción
Aplicación Android que implementa la funcionalidad de TextToSpeech para convertir texto en voz.  
El usuario puede presionar un botón para que el dispositivo lea en voz alta el contenido de un TextView.

---

## Funcionalidad

- Muestra un mensaje en pantalla mediante un TextView
- Incluye un botón para ejecutar una acción
- Inicializa el motor de TextToSpeech
- Verifica si el dispositivo puede reproducir voz:
  - Si funciona → muestra "Si puede hablar"
  - Si falla → muestra "No puede hablar"
- Al presionar el botón:
  - Se obtiene el texto del TextView
  - Se reproduce en voz alta en español (México)
 
<img width="351" height="769" alt="image" src="https://github.com/user-attachments/assets/f2d77613-c91d-427d-b422-7f9fe95423c6" />


---

## Tecnologías utilizadas

- Kotlin
- Android Studio
- TextToSpeech API
- XML (Layouts)

---

## Estructura del proyecto
```
AndroidCero_2.0/
├── app/
│ ├── src/main/
│ │ ├── java/mx/unam/aragon/
│ │ │ └── MainActivity.kt
│ │ ├── res/
│ │ │ ├── layout/activity_main.xml
│ │ │ └── values/
│ │ └── AndroidManifest.xml
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts

```

---

## Objetivo

Comprender el uso de:
- Componentes de interfaz gráfica en Android  
- Manejo de eventos (clic en botón)  
- Integración de APIs del sistema (TextToSpeech)  
- Interacción entre interfaz y lógica en Kotlin  

---

## Notas

- El idioma configurado es español (México)  
- Requiere que el dispositivo tenga instalado un motor de voz  
- Se recomienda tener el volumen activo  

---
