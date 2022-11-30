# gRPC Streaming

Ejemplo desarrollado para probar los diferentes tipos de Streaming ofrecidos por gRPC.

-   **Unaria:**  el cliente envía una única solicitud y el servidor devuelve una única respuesta.
-   **Streaming del servidor:**  el cliente envía una única solicitud y el servidor puede retornar múltiples respuestas, es decir, un flujo de respuesta.
-   **Streaming del cliente:**  donde el cliente envía múltiples peticiones y el servidor devuelve una única respuesta.
-   **Streaming bidireccional:**  en la que tanto el cliente como el servidor envían mensajes entre sí de forma simultánea, es decir, sin esperar respuesta del otro lado.

# Repositorio

## Prerequisitos

- Java 1.8 
- Maven 3.8.x

## Ejecución

Para ejecutar el ejemplo y levantar el servidor en local simplemente es necesario lanzar el siguiente comando: 
```
mvn exec:java -Dexec.mainClass=com.paradigma.grpc.streaming.StoreServer
````

## Testing

Para probar se puede utilizar como cliente Postman. Actualmente es una funcionalidad en versión Beta y no permite descargar e importar colecciones de este tipo. 

Para probar el ejemplo es necesario realizar lo siguientes pasos desde la aplicación de escritorio de Postman: 

- Seguir los pasos que indican en este video: https://blog.postman.com/postman-now-supports-grpc/
- Importar el fichero .proto que está en este repositorio en ./src/main/proto/store.proto
- Ejecutar llamadas.

Para facilitar la tarea se incluyen algunas peticiones de ejemplo para cada servicio gRPC: 

-   **Unaria** con el servicio unaryStreamingGetProductById
```
{
	"product_id": "1234354"
}
```
-   **Streaming del servidor**  con el servicio serverSideStreamingGetProductsByName
```
{
	"product_name": "nombre"
}
```

- -   **Streaming del cliente:**  con el servicio 
clientSideStreamingCreateOrder
```
{
	"product_id": "2",
	"product_name": "2",
	"product_description": "2 5",
	"product_price": 100
}
```

-   **Streaming bidireccional:**  con el servicio 
bidirectionalStreamingUpdateStock
```
{
	"product_id": "2",
	"stock_operation": "ADD",
	"items_number": 100
}```
