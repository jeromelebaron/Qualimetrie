#Qualimetrie

Cours concernant toutes les bonnes pratiques de qualimétrie en JAVA.

##Tests unitaires

Nous utiliserons le framework JUnit 4

Les différentes méthodes utilisées sont :

- @Test qui permet d'indiquer qu'un méthode doit etre testée (public void testXXXX() en JUnit 3)
- @Before qui permet de faire des traitements avant chaque tests (setUp() en 3)
- @After qui permet de faire des traitements après chaque tests (teadrDown en 3)
- @BeforeClass et @AfterClass : pour le début et la fin de la classe 

Le test d'une méthode (service) :

- certaines méthodes ne sont pas possible à tester `public void xxxx()`
- plus de procédures dans le code

Les SFD (usecase) fournissent les différents cas à tester :

- cas nominal --> obligatoire
- cas alternatif --> obligatoire
- cas d'échec --> 1 ou 2 significatif

La couverture idéale doit être de 80%
