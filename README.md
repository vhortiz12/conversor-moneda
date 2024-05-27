# Conversor de Monedas

¡Bienvenido al Conversor de Monedas! Este proyecto es una aplicación de consola desarrollada en Java que permite convertir montos de dinero entre diferentes monedas utilizando una API de tipo cambio.

## Características

- **Interfaz de usuario sencilla**: La aplicación presenta un menú interactivo para seleccionar las conversiones.
- **Múltiples conversiones soportadas**: Convierte entre Dólar Americano (USD), Peso Colombiano (COP) y Peso Mexicano (MXN).
- **Consulta de tipo de cambio en tiempo real**: Utiliza la API de ExchangeRate para obtener tipos de cambio actualizados.
- **Precisión con BigDecimal**: Manejo de grandes cifras de dinero con alta precisión.

## Tecnologías Utilizadas

- **Java 11** o superior
- **API de ExchangeRate** para obtener tipos de cambio
- **Gson** para el procesamiento de JSON

## Instalación

Sigue estos pasos para clonar y ejecutar el proyecto en tu máquina local:

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/tu-usuario/conversor-de-monedas.git
    cd conversor-de-monedas
    ```

2. **Compila el proyecto**:
    ```bash
    javac -cp .:path/to/gson.jar Principal.java
    ```

3. **Ejecuta la aplicación**:
    ```bash
    java -cp .:path/to/gson.jar Principal
    ```

## Uso

Al ejecutar la aplicación, verás el siguiente menú:

Bienvenid@ al Conversor de Monedas

A continuación presentamos las opciones de conversión:

1) Dólar americano [USD] --> Peso Colombiano [COP]
2) Peso Colombiano [COP] --> Dólar Americano [USD]
3) Dólar americano [USD] --> Peso Mexicano [MXN]
4) Peso Mexicano [MXN] --> Dólar americano [USD]
5) Peso Colombiano [COP] --> Peso Mexicano [MXN]
6) Peso Mexicano [MXN] --> Peso Colombiano [COP]
7) Salir

Selecciona la opción deseada e ingresa el monto de dinero que quieres convertir. La aplicación se encargará de obtener el tipo de cambio actual y mostrar el resultado de la conversión.

## Ejemplo

Ingrese la opción que desea: 1
Ingrese el monto de dinero a convertir: 100

El valor $100.00 [USD] corresponde al valor de --> $375000.00 [COP]


## Contribuciones

¡Contribuciones son bienvenidas! Si deseas mejorar este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama nueva (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva característica'`).
4. Sube tu rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT.

## Contacto

Desarrollado por Victor Hugo Ortiz Chitiva [vhortiz12]. Si tienes alguna pregunta o sugerencia, no dudes en contactarme a través de chitiva1203@gmail.com

