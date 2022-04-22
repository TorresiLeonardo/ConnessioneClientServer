# ConnessioneClientServer
Classi utilizzate
Client
Server
Entrambe come main
Runnare prima il client e poi il server.

È necessario importare java.net.* per il funzionamento.

Nel server creiamo un serverSocket con porta in ascolto 2000
Con il metodo accept() il server resta in ascolto
Con il metodo getRemoteSocketAddress() riceviamo l'indirizzo del socket collegato

Nel client creiamo un socket con id e porta
Con close() chiudiamo il socket
