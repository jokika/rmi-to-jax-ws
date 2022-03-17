# rmi-to-jax-ws
This is a re-implementation of RMI client - server text converter using JAX-Ws SOAP web service.
You can test it with the following request:

xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:converterservice="http://service.jaxwswebservice.sdj3.via/">
   <soapenv:Header/>
   <soapenv:Body>
      < converterservice:toUpper>
         <!--Optional:-->
         <text>jax-ws soap</text>
      </ converterservice:toUpper>
   </soapenv:Body>
</soapenv:Envelope>
