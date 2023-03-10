DESPLIEGUE LOCAL
1 MOCK SOAP
1.	Abra SOAPUI y importe el WSDL que se encuentra en la carpeta MOCK SOAP
2.	Abra un operación cualquiera y en el request de click derecho y de click en “add to MockService”
3.	Click en MockService1
4.	En la ventana MockService1 dele click en el engrane y configure la exposición.
2 MICROSERVICIOS
Antes de poner a correr los micro servicios debe revisar:
1.	En el application.properties de los micro servicios login y device modificar el valor de Spring.rutamock por la configuración realizada en el paso 1 MOCKSOAP.
