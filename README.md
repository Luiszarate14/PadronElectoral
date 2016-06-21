# PadronElectoral
Calcula las estadísticas del padrón electoral de Costa Rica

# Compilación

  $ make

También puede compilarse con netbeans.
  
# Ejecución

Los archivos  Distelec.txt PADRON_COMPLETO.txt pueden ser obtenidos de 
http://www.tse.go.cr/descarga_padron.htm.

El archivo resultado es la ruta donde se guardarán los resultados.

Si se desea ejecutar con Java

    $ java padronelectoral.Main Distelec.txt PADRON_COMPLETO.txt resultado.txt

Si se desea ejecutar con make

    $ make run Distelec.txt PADRON_COMPLETO.txt resultado.txt
