<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">TIF</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>07</td><td>AÑO LECTIVO:</td><td>2023 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>26-May-2022</td><td>FECHA FIN:</td><td>28-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">INTEGRANTES:
    <ul>
        <li>Jordy Rolando Tejada Lazo</li>   
        <li>Kevin Pedro Yare Chuyunquia</li>
        <li>Michael Steve Hurtado Bejarano</li>    
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Dra. Karim Guevara Puente de la Vega

Mg. Richart Smith Escobedo Quispe

Mg. Edith Giovanna Cano Mamani

Mg. Jeymi Valdivia Eguiluz</li>

</ul>
</td>
</<tr>
</tdbody>
</table>
- Nuestro codigo usamos lo que son una aplicacion Java con Maven

- Primero que nada hay que tener un nodo para el arbol que en este caso usaremos un arbol AVL enlazado y este seria el nodo en el cual tendriamos el dato, left, right y bf que serian los datos del nodo

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/e64e77e7-25ab-4593-8cf4-be1f12bfd208)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/e726db0e-69ff-4902-84a7-f1efa73c4f5c)

- El arbol seria este siendo de tipo generico E los metodos que usamos son el de isEmpty() para verificar si esta vacio, insert() para poner los datos y otro metodo insert() sobrecargado para añadir en otros nodos, balanceToRight() y balanceToLeft() para balancear el arbol, rotateRSL() y rotateRSR() para la rotacion del arbol, getRoot() para obtener el root, el search() igual que el insert tambien tiene otro metodo sobrecargado que sirve para buscar, el metodo remove() igual tambien otro metodo sobrecargado para eliminar y por ultimo el metodo inOrden() para ordenar el arbol en forma inorden

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/d3841746-f31f-4bb4-a9e3-cca846907f92)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/986f554f-f211-4e7f-8d0b-67b1de7708d7)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/4da00d0d-eab1-44dc-b3aa-344a5261fa20)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/27baab47-3e68-47a2-a17b-3518bf2a70b1)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/35aa6052-38f4-49b9-856e-2d0fa762a02d)

- Ahora para la explicacion del codigo de la aplicacion

- Vamos a crear una clase llamada Almacen el cual sera la clase que controle los almacenes de nuestra app este Almacen tendra datos como el codigo, nombre y direccion

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/472be544-96d0-425d-b5da-a06484845fe8)

- Ahora pasemos con los productos que seria lo mismo que el Almacen

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/16cc66c7-16f6-4bf7-ba84-caeaf1cedf65)

- El ResultDistr es simple es solo un arraylist de almacenes

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/9537c0d1-50b9-4548-9f73-0667bed60122)

- El controlador principal para mostrar el interfaz seria este el cual estariamos usando javafx y carga los almacenes y busqueda de almacenes

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/4c5d8d84-8263-4a78-8719-ce88275ee6fa)

- Para la carga de almacenes simplemente solo usamos el BufferReader para leer el contenido de un archivo txt

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/fa67fd68-802c-46d8-b49a-fbcf105f0a30)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/a0a550d7-02df-48ca-8ac9-d27de3395ff3)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/66a031fe-9732-4c02-8e85-234d058b2759)

- Para lo ultimo el codigo de la App el cual seria el interfaz el cual le damos un tamaño predefinido y llamamos a los metodos de cargar almacenes y ademas tambien se carga los recursos .fxml

  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/3ae18f97-14cc-4e1e-a916-5b35c60faa86)
  ![image](https://github.com/jrolando19/grupo01EdaFinalTIF/assets/83080715/0f508f68-79f0-4cf4-9920-91f5978ae1ea)

- Existe un error con la parte gráfica, ya que desde consola si funcionaba el proyecto pero al implementar la parte gráfica, desde los mismos textfield con los archivos y errores de compatibilidad, así como de versiones de las configuraciónes de los IDE'S. Por lo que se muestra una captura de que el programa en forma gráfica está implementado a un 45% con errores.

# Revisión de elementos de programación

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

## REFERENCIAS

    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers

#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE
[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/
[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit
[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html
[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/
[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/
[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/
[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
