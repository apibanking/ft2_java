### steps (to run)

1. clone the code
2. run the client with defaults `java -cp args4j-2.33.jar:. FT2`
2. run the client add see help `java -cp args4j-2.33.jar:. FT2 -?`

### steps (to develop)

1. download the wsdl and associated xsd files, to a local folder
2. generate the jax-ws classes `wsimport fundsTransferByCustomerService2.wsdl  -extension`
3. compile the client `javac FT2.java -classpath args4j-2.33.jar:.`

### client-certificate

1. the code makes 2 calls, one with-out 2 way ssl, and one with the 2 way ssl
2. the repository contains a certificate that is white-listed in the UAT enviornment, this is for easy reference (qg-client.jks)
3. once the sample code runs, you can replace that with a new jks file with your certificate
4. do not have more than 1 client certificate in the jks file
