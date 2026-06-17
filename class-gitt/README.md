# Documentación de Git Bash

Bienvenido a la documentación de Git Bash. Este archivo organiza el contenido por clases para que sea más fácil revisar lo visto en cada sesión.
contador += 1;
---

## Contenido

1. [Clase 1: Introducción y comandos básicos](#clase-1-introducción-y-comandos-básicos)
2. [Clase 2: Git local y primer commit](#clase-2-git-local-y-primer-commit)
3. [Clase 3: Revisión de cambios y flujo de trabajo](#clase-3-revisión-de-cambios-y-flujo-de-trabajo)
4. [Clase 4: Analizar cambios en los archivos de tu proyecto Git](#clase-4-analizar-cambios-en-los-archivos-de-tu-proyecto-git)
5. [Clase 5: ¿Qué es el staging?](#clase-5-qué-es-el-staging)
6. [Clase 6: Volver en el tiempo con reset y checkout](#clase-6-volver-en-el-tiempo-con-reset-y-checkout)
7. [Clase 7: Git reset vs. Git rm](#clase-7-git-reset-vs-git-rm)
8. [Clase 8: Flujo de trabajo básico con un repositorio remoto](#clase-8-flujo-de-trabajo-básico-con-un-repositorio-remoto)
9. [Clase 8-B: Introducción a las ramas o branches de Git](#clase-8-b-introducción-a-las-ramas-o-branches-de-git)
10. [Clase 9: Entorno virtual de Python](#clase-9-entorno-virtual-de-python)
11. [Clase 9-A: Fusión de ramas con Git merge](#clase-9-a-fusión-de-ramas-con-git-merge)
12. [Clase 9-B: Resolución de conflictos al hacer merge](#clase-9-b-resolución-de-conflictos-al-hacer-merge)

---

## Clase 1: Introducción y comandos básicos

### Objetivo

Aprender la terminal básica y los comandos fundamentales para navegar en el sistema de archivos.

### Comandos principales

```bash
pwd            # muestra la ruta actual
cd /           # va a la raíz del disco
cd ~           # va al directorio del usuario
ls             # lista los archivos y carpetas
ls -al         # lista todos los archivos, incluidas las ocultas
ls -l          # lista en formato largo
ls -a          # lista todos los archivos sin formato largo
clear          # limpia la pantalla
cd ..          # sube un nivel en la carpeta
```

### Conceptos de ruta

- `./` : carpeta actual
- `../` : carpeta anterior
- `cd /D` : cambia de disco en Windows
- `df -h` : muestra el espacio de discos en Ubuntu
- `cd /mnt/d` : accede a otro disco desde WSL en Windows

### Ejercicio práctico

```bash
cd /mnt/c
cd ~
mkdir Tecnicatura
cd Tecnicatura
mkdir Python
mkdir Java
mkdir JavaScript
```

> Nota: en Windows no importa si las carpetas tienen mayúsculas o minúsculas, pero en Linux sí.

---

## Clase 2: Git local y primer commit

### Objetivo

Crear un repositorio Git local, configurar el usuario y hacer los primeros commits.

### Flujo de trabajo

```bash
cd tecnicatura
mkdir class-git
cd class-git
git init
```

> Importante: no ejecutar `git init` nuevamente si ya existe un repositorio en la carpeta.

### Crear y guardar archivos

```bash
code .          # abre Visual Studio Code en el directorio actual
ctrl + n        # crea un archivo nuevo
# guardar el archivo como historia.txt
git status      # muestra qué archivos cambian y cuáles están listos para commit
git add historia.txt   # añade el archivo al área de preparación (staging)
```

### Configurar usuario global de Git

```bash
git config --global user.name "Ariel Betancud"
git config --global user.email "betancudariel@gmail.com"
git config --list
```

### Primer commit

```bash
git add .
git commit -m "Primer commit"
```

### Segundo commit

```bash
git add .
git commit -m "Mi segundo commit"
```

### Ver historial

```bash
git log historia.txt
```

---

## Clase 3: Revisión de cambios y flujo de trabajo

### Objetivo

Ver cómo revisar cambios, eliminar archivos y trabajar con commits desde el editor.

### Comandos de revisión y limpieza

```bash
cd tecnicaturagit           # entra en la carpeta del proyecto de prácticas
ls                          # lista archivos y carpetas en el directorio actual
cd ..                       # sube un nivel en la estructura de carpetas
rm historia.txt             # elimina el archivo historia.txt
rm --help                   # muestra la ayuda del comando rm
mkdir class-git             # crea una carpeta nueva
cd class-git                # entra en la nueva carpeta
touch README.md             # crea el archivo README.md vacío
code .                      # abre Visual Studio Code en la carpeta actual
```

### Ejemplos comunes

- `rm historia.txt` : elimina un archivo
- `rm --recursive -R Git` : elimina un directorio completo
- `git status` : muestra el estado actual del repositorio
- `git add .` : agrega todos los cambios al área de preparación
- `git commit -m "Mensaje"` : crea un commit con un mensaje

### Commit sin mensaje directo

```bash
git commit
```

Esto abre el editor de texto predeterminado para escribir el mensaje del commit.

### Uso de `vim` para commits

- `Esc`
- `:wq!` + `Enter`

### Ver cambios y comparar commits

```bash
git show
git log historia.txt
git diff hash_commit_viejo hash_commit_nuevo
```

> Recuerda: primero la versión antigua y luego la más reciente.

---

## Clase 4: Analizar cambios en los archivos de tu proyecto Git

### Objetivo

Agregar comentarios a los comandos y revisar el flujo de commits usando el editor.

### Flujo de trabajo

```bash
cd tecnicatura               # entra en la carpeta principal del curso
cd class-git                 # entra en el repositorio local de Git
ls                           # lista el contenido actual
touch historia.txt           # crea el archivo historia.txt si no existe
code .                       # abre Visual Studio Code en la carpeta actual
```

- Modificar `historia.txt` con el texto: `Bienvenido     mi nombre es Ariel` (reemplaza Ariel por tu nombre)
- Guardar con `ctrl + s`

### Git status y commits

```bash
git status
git add .
git status
git commit
```

> Sin usar `-m`, Git abre el editor predeterminado para escribir el mensaje de commit.

### Salir de `vim`

- `Esc`
- `:wq!` + `Enter`

> En algunas terminales Linux también funciona `Esc` + `Shift + Z` + `Z`.

### Siguientes pasos

1. Agregar otra línea en `historia.txt`: `estoy estudiando programación`
2. Guardar con `ctrl + s`
3. `git add .`
4. `git commit`

### Editor de línea de comandos

- `Esc + i` : entra en modo insertar para escribir el mensaje
- `Ctrl + x` : salir en algunos editores de línea de comandos
- `s` + `Enter` : confirmar cambios si se pregunta guardar

### Revisar historial y diferencias

```bash
git show
git log historia.txt
q
git diff hash_commit_numerico hash_commit_numerico
q
cd ..
cd ..
```

> Para comparar commits, coloca primero el hash antiguo y luego el hash más reciente.

---
## Clase 5: ¿Qué es el staging?

### Idea principal

El staging es el área de preparación en memoria RAM donde colocas cambios antes de confirmarlos en el repositorio.

### Flujo

- Área de trabajo: archivos en tu proyecto.
- `git add historia.txt`: mueve el archivo al staging.
- `git commit -m "Mensaje"`: guarda el commit en `.git`.

### Gitflow y ramas

- `branch` = rama de trabajo.
- `merge` = unir una rama con otra.
- Master: rama principal.
- Develop: rama experimental.
- Feature: nueva funcionalidad.
- Hotfix: corrección urgente.

> Las ramas auxiliares se integran en Master o Develop para evitar errores directos en producción.

---
## Clase 6: Volver en el tiempo con reset y checkout

### Objetivo

Revertir cambios y explorar versiones anteriores del repositorio.

### Pasos clave

```bash
cd tecnicatura               # entra en la carpeta principal del curso
cd class-git                 # entra en el repositorio local de Git
ls                           # lista archivos en el directorio actual
touch historia.txt           # crea el archivo si no existe
code .                       # abre Visual Studio Code
git commit -a                # hace commit de todos los archivos modificados y rastreados
```

- `git log --oneline` : copia el hash corto.
- `git reset <hash>` : vuelve a esa versión.
- `git reset --hard <hash>` : con todo borrado.
- `git reset --soft <hash>` : conserva los cambios en staging.
- `git checkout <hash>` : muestra el archivo en esa versión.
- `git checkout master` : vuelve a la rama principal.

### Ramas de respaldo

```bash
git branch cambios
git branch second
git branch tuNombre
git branch hotfix
git branch -d cambios
git branch -D cambios
```

> Usa ramas secundarias para evitar tocar `master` directamente.

---
## Clase 7: Git reset vs. Git rm

### Idea principal

- `git reset` mueve cambios fuera del staging o regresa commits.
- `git rm` elimina archivos de Git.

### Resumen rápido

- `git reset --soft <hash>`: mantiene cambios en staging.
- `git reset --mixed <hash>`: quita cambios del staging pero los conserva en el disco.
- `git reset --hard <hash>`: borra todo, no hay vuelta atrás.
- `git reset HEAD <archivo>`: saca un archivo del staging sin borrarlo.
- `git rm <archivo>`: elimina el archivo del repositorio y del staging.
- `git rm --cached <archivo>`: deja el archivo en disco, pero lo saca de Git.
- `git rm --force <archivo>`: borra del repositorio y del disco.

### Diferencia clave

- `git reset` cambia qué está preparado para commit.
- `git rm` elimina archivos del control de versiones.

---
## Tarea y buenas prácticas

- Agregar comentarios en los comandos del README.
- Explicar qué hace cada comando.
- Guardar los cambios y hacer un commit.

### Buenas prácticas

- Usar mensajes claros en los commits.
- Revisar `git status` antes de hacer `git add`.
- No inicializar dos veces un repositorio en la misma carpeta.
- Mantener el README actualizado con las clases.

---
## Clase 8: Flujo de trabajo básico con un repositorio remoto

### Objetivo

Entender cómo conectar un repositorio local con un servidor remoto y trabajar con actualizaciones compartidas.

### Conceptos clave

- El repositorio local vive en tu computadora.
- El servidor remoto guarda el mismo proyecto en línea para que otros puedan colaborar.
- GitHub, GitLab y BitBucket son ejemplos de servidores remotos.

### Comandos remotos básicos

```bash
git clone url_del_servidor_remoto   # descarga el proyecto y su historial

git push                            # envía tus cambios al servidor remoto

git fetch                           # trae actualizaciones del remoto al local

git merge                           # combina cambios remotos con tu trabajo local

git pull                            # hace fetch y merge en un solo paso
```

### Comandos útiles para historial y revisión

```bash
git log --oneline

git log --decorate

git log --stat

git log -p

git shortlog

git log --graph --oneline --decorate --all

git log -3

git log --after="2018-1-2"

git log --after="today"

git log --after="2018-1-2" --before="today"

git log --author="Name Author"

git log --grep="INVIE"

git log --grep="INVIE" -i

git log -- index.html

git log -S "Por contenido"

git log > log.txt
```

### Tarea

Agregar esta clase al `README.md` en formato Markdown y hacer el commit correspondiente con el cambio.

---
## Clase 8-B: Introducción a las ramas o branches de Git

### Objetivo

Aprender a usar ramas para trabajar en cambios paralelos sin afectar la rama principal.

### Conceptos clave

- `master` es la rama principal o madre del proyecto.
- Las ramas permiten experimentar o desarrollar funciones sin alterar `master`.
- `HEAD` señala la rama y el commit actuales.
- Crear ramas copia el historial de `master` en un nuevo punto de trabajo.
- Los cambios en una rama no se ven en `master` hasta que se fusionan.

### Comandos de ramas

```bash
git branch nombre-rama             # crea una nueva rama

git checkout nombre-rama           # cambia de rama

git checkout -b rama               # crea y cambia a una rama nueva

git reset id-commit                 # mueve HEAD a un commit y descarta commits posteriores

git checkout rama-o-id-commit       # mueve HEAD a otra rama o commit sin borrar historial
```

### Práctica de ramas

1. `cd Tecnicatura`
2. `cd class-git`
3. `code .`
4. `touch index.html` y agregá un `h1` con tu nombre.
5. Guardá con `ctrl + s`.
6. `git status`
7. `git commit -am "mensaje del commit"`
8. `git log` y luego `q` para salir.
9. `git log --stat` y luego `q`.
10. `git branch` para ver la rama actual.
11. `git show` para ver el último commit apuntado por `HEAD`.
12. `git branch second` para crear la rama `second`.
13. `git checkout second` para moverte a esa rama.
14. `git branch` para verificar en qué rama estás.
15. `git status` para ver el estado y el `HEAD` actual.

### Nota

Al crear `second`, se copia todo el historial de `master` en esa rama. Los cambios que hagas en `second` no afectarán a `master` hasta que hagas un `merge`.

### Tarea

Agregar esta clase al `README.md` en formato Markdown y hacer el commit correspondiente con el cambio.

---

## Clase 9: Entorno virtual de Python

### Objetivo

Configurar un entorno virtual de Python para aislar dependencias del proyecto y aprender a gestionar el flujo de trabajo con Git.

### Pasos iniciales

```bash
mkdir python-final                # Crear carpeta del proyecto
cd python-final                   # Entrar en la carpeta
git init                          # Inicializar repositorio Git
touch finales.py                  # Crear archivo Python
code .                            # Abrir Visual Studio Code
```

### Verificar versión de Python

```bash
python -V                         # Ver versión de Python
python3 -V                        # Ver versión de Python 3 (Linux/Mac)
```

### Crear y activar entorno virtual

```bash
python3 -m venv venv              # Crear entorno virtual

# En Linux/Mac:
source venv/bin/activate          # Activar entorno virtual

# En Windows:
venv/scripts/activate             # Activar entorno virtual
```

### Actualizar pip

```bash
python3 -m pip install --upgrade pip    # Actualizar pip a la última versión
```

### ¿Qué es pip?

**PIP** (*Pip Installs Packages*) es el gestor de paquetes de Python. Sirve para **instalar, actualizar y eliminar bibliotecas** que no vienen incluidas con Python.

### ¿Por qué actualizamos PIP?

Se actualiza porque las nuevas versiones suelen incluir:

- **Corrección de errores**.
- **Mejoras de seguridad**.
- **Mayor compatibilidad** con versiones nuevas de Python.
- **Mejor rendimiento** al instalar paquetes.
- Soporte para nuevas funciones y formatos de paquetes.

### Próximos pasos

1. Crear el primer commit con los cambios iniciales
2. Configurar el repositorio remoto (GitHub, GitLab, etc.)
3. Hacer push al repositorio remoto
4. Crear un `README.md` documentando los comandos y configuración

### Tarea

Hacer un commit inicial y subirlo al repositorio remoto con un `README.md` que documente todos los pasos y la respuesta sobre qué es pip y por qué se actualiza.

---

## Clase 9-A: Fusión de ramas con Git merge

### Objetivo

Aprender a fusionar ramas de manera efectiva usando `git merge` para integrar líneas de desarrollo independientes.

### Concepto de fusión en Git

La fusión en Git es la forma en que este sistema une un historial bifurcado. El comando `git merge` permite integrar líneas de desarrollo independientes generadas por `git branch` en una sola rama. Con este comando, podemos crear un nuevo commit que combina dos ramas o branches: la rama actual y la rama que se indica después del comando.

Estos comandos de fusión del merge afectan solo a la rama actual y no a la rama de destino. Por lo tanto, se recomienda utilizar `git checkout` para seleccionar la rama actual y `git branch -d` para eliminar la rama de destino obsoleta.

### Funcionamiento de Git merge

Git merge fusiona secuencias de confirmaciones en un solo historial, generalmente para combinar dos ramas. Busca una confirmación de base común y genera una confirmación de fusión que representa la combinación de las dos ramas hasta el resultado final.

### ¿Cómo unir dos ramas en git?

Para combinar ramas en tu repositorio local, usa `git checkout` para cambiar a la rama donde deseas fusionar. Por lo general, esta es la rama principal. Luego, emplea `git merge` y especifica el nombre de la otra rama que deseas traer a esta rama.

### ¿Cómo realizar un merge en git?

Para hacer un merge en Git, primero asegúrate de estar en la rama correcta. Después, usa el comando `git merge` seguido del nombre de la rama que quieres combinar:

```bash
git checkout master        # Cambiar a la rama master (o la rama de destino)
git merge segunda          # Fusionar la rama 'segunda' en master
```

Es importante tener en cuenta que en caso de haber conflictos, debes guardar tus cambios antes de hacer `git checkout` para evitar perder tu trabajo. También es recomendable emplear los comandos básicos de GitHub, como `git fetch`, `git push` y `git pull`, para mantener actualizado tu repositorio.

### Comandos básicos de GitHub (referencia completa)

```bash
git init                                    # Crear un repositorio (si ya está en la nube traerlo sin hacer git init)

git add .                                   # Agregar un archivo a staging

git commit -m "mensaje"                     # Guardar el archivo en git con un mensaje

git branch nombre_rama                      # Crear una nueva rama

git checkout nombre_rama                    # Moverse entre ramas

git push origin rama                        # Mandar cambios a un servidor remoto

git fetch                                   # Traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local

git merge rama                              # Fusión de ramas (funcionando como un commit en la rama actual, trayendo la rama indicada)

git pull origin rama                        # Fetch y merge al mismo tiempo

git checkout "codigo de version" "nombre del archivo"  # Volver a la última versión de la que se ha hecho commit

git reset                                   # Vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones

git reset --soft                            # Vuelve a la versión en el repositorio, pero guarda los cambios en staging

git reset --hard                            # Vuelve a su versión anterior (CUIDADO: elimina cambios no guardados)

git reset HEAD                              # Saca los cambios de staging, pero no los borra. Es lo opuesto a git add

git rm                                      # Elimina los archivos, pero no su historial. Se utiliza así:

git rm --cached                             # Elimina los archivos en staging pero los mantiene en el disco duro

git rm --force                              # Elimina los archivos de git y del disco duro

git status                                  # Estado de archivos en el repositorio

git log                                     # Historia entera del archivo

git log --stat                              # Cambios específicos en el archivo a partir de un commit

git show                                    # Cambios históricos y específicos hechos en un archivo

git diff "codigo de version 1" "codigo de version 2"  # Comparar cambios entre versiones

git diff                                    # Comparar directorio con staging
```

### Caso práctico: Resolución de conflictos

A continuación, se muestra un flujo de trabajo completo con resolución de conflictos:

```bash
git status                                  # Verificar estado en rama segunda

# Hacemos cambios en el archivo y guardamos

git commit -am "Finalizado el cambio en rama segunda"

git status

git checkout master                         # Cambiamos a master (perdemos lo que habíamos hecho)

# Hacemos cambios en el archivo agregando un nuevo párrafo y guardamos

git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"

git checkout segunda                        # Vemos cómo desaparecen los cambios

git checkout master                         # Aquí es donde vamos a hacer el merge

git merge segunda                           # En caso de conflictos, resolver a través de VSC

git commit -am "Arreglando conflicto"       # Una vez solucionado debemos commitear

git status                                  # Revisar en el navegador y en el código si algo quedó mal

git commit -am "Solucionado el conflicto 2"

git merge segunda                           # Ahora todo va bien

git commit -am "Volví a comentar en este caso de mi área laboral"  # Añado información al archivo

git log                                     # Ver el historial

# Presionar 'q' para salir

git commit -am "Para guardar estos cambios en el README.md"

git checkout segunda                        # Cambiar a rama segunda

git merge master                            # Traemos todos los cambios de master

git commit -am "Cargamos esto ahora"        # Vamos a master y mergeamos

git checkout master

git merge segunda                           # Finalizamos con esto
```

### Puntos clave a recordar

- **Nunca debemos seleccionar "Fusionar los dos cambios"** cuando aparezca un conflicto en Visual Studio Code. Debemos revisar cuidadosamente qué cambios queremos mantener.
- Siempre revisar el archivo después de resolver conflictos para asegurar que todo está correcto.
- Los cambios en una rama no afectan a otras ramas hasta que se haga un merge.
- Es importante mantener commits descriptivos para facilitar el seguimiento del historial.

### Tarea

Agregar esta clase al `README.md` en formato Markdown y hacer el commit correspondiente con el cambio.

---

## Clase 9-B: Resolución de conflictos al hacer merge

### Objetivo

Aprender a resolver conflictos que surgen cuando se fusionan ramas con cambios incompatibles.

### Conceptos fundamentales

Git nunca borra nada, a menos que nosotros se lo indiquemos. Cuando usamos los comandos `git merge` o `git checkout` estamos cambiando de rama o creando un nuevo commit, no borrando ramas ni commits (recuerda que puedes borrar commits con `git reset` y ramas con `git branch -d`).

Git es muy inteligente y puede resolver algunos conflictos automáticamente: cambios, nuevas líneas, entre otros. Pero algunas veces no sabe cómo resolver estas diferencias, por ejemplo, cuando dos ramas diferentes hacen cambios distintos a una misma línea.

Esto lo conocemos como **conflicto** y lo podemos resolver manualmente. Solo debemos hacer el merge, ir a nuestro editor de código y elegir si queremos quedarnos con alguna de estas dos versiones o algo diferente. Algunos editores de código como Visual Studio Code nos ayudan a resolver estos conflictos sin necesidad de borrar o escribir líneas de texto, basta con hacer clic en un botón y guardar el archivo.

### Flujo de resolución de conflictos

Recuerda que siempre debemos crear un nuevo commit para aplicar los cambios del merge. Si Git puede resolver el conflicto, hará commit automáticamente. Pero, en caso de que no pueda resolverlo, debemos solucionarlo y hacer el commit.

Los archivos con conflictos por el comando `git merge` entran en un nuevo estado que conocemos como **Unmerged**. Funcionan muy parecido a los archivos en estado Unstaged, algo así como un estado intermedio entre Untracked y Unstaged. Solo debemos ejecutar `git add` para pasarlos al área de staging y `git commit` para aplicar los cambios en el repositorio.

### Cómo revertir un merge

Si nos hemos equivocado y queremos cancelar el merge, debemos usar el siguiente comando:

```bash
git merge --abort
```

### Conflictos en repositorios remotos

Al trabajar con otras personas, es necesario utilizar un repositorio remoto.

```bash
git clone enlace-ssh                        # Copiar el repositorio remoto al directorio local

git fetch                                   # Traer actualizaciones del repositorio remoto

git push origin master                      # Enviar cambios al repositorio remoto

git merge                                   # Fusionar cambios

git pull origin master                      # Traer cambios y fusionarlos al mismo tiempo

git commit -am "Este es un commit rápido"   # Crear commit rápidamente (add + commit)

git branch                                  # Ver las ramas creadas y en cuál estamos

git branch second                           # Crear una nueva rama llamada 'second'

git checkout second                         # Ir a la rama 'second' saliendo de master

# Hacemos cambios en el código que estamos trabajando

ctrl + s                                    # Guardamos los cambios

git add .

git commit -m "Cambios en el archivo de trabajo"

git push origin second                      # Enviar los cambios de la rama 'second'

git checkout master                         # Volver a master

git merge second                            # Mergear los cambios a la rama master

git push origin master                      # Enviar los cambios a master
```

### Puntos clave de Git

- Para actualizar el repositorio local se hace uso del comando `git fetch`, luego se debe fusionar los datos traídos con los locales usando `git merge`.
- Para traer los datos y fusionarlos a la vez, en un solo comando, se usa `git pull`.
- Para crear commits rápidamente, fusionando `git add` y `git commit -m ""`, usamos `git commit -am ""`.
- Para generar nuevas ramas, hay que posicionarse sobre la rama que se desea copiar y utilizar el comando `git branch`.
- Para cambiar el nombre por default que recibe la rama principal (master):

```bash
git config --global init.defaultBranch main
```

A partir de este momento cada repositorio creado recibirá el nombre `main` por default.

- Para saltar entre ramas, se usa el comando `git checkout`.
- Una vez realizado los cambios en la rama, estas deben fusionarse con `git merge`.
- El merge ocurre en la rama en la que se está posicionado. Por lo tanto, la rama a fusionar se transforma en la principal.
- Los merges también son commits.
- Los merges pueden generar conflictos, esto aborta la acción y pide que soluciones el problema manualmente, aceptando o rechazando los cambios que vienen.

### Caso práctico: Creando y resolviendo un conflicto

#### Paso 1: Realizar cambios en master

```bash
# Hacemos cambios estando en la rama master, en el archivo de trabajo

ctrl + s                                    # Guardamos los cambios

git status                                  # Ver el estado

git add .

git commit -m "Agregando cambios nuevos al archivo de trabajo"

git push origin master                      # Enviamos a master

git log                                     # Ver el historial

# Presionar 'q' para salir
```

#### Paso 2: Sincronizar rama second con master

```bash
git checkout second                         # Volvemos a la rama second

git merge master                            # Traemos los cambios desde master y tenemos las dos ramas actualizadas

git push origin second                      # Enviamos los cambios
```

#### Paso 3: Crear el conflicto

Ahora vamos a crear un conflicto para ver cómo solucionarlo. Cargaremos datos nuevos en un archivo HTML estando en la rama `second`, y también haremos lo mismo estando en `master`.

```bash
# Estando en rama second: modificamos un archivo HTML

ctrl + s                                    # Guardamos los cambios en la rama second

git commit -am "Modifiqué el html y el color del texto"  # Ejemplo de mensaje

git checkout master                         # Vamos a master

# Modificamos el mismo archivo html (ponemos código diferente)

ctrl + s                                    # Guardamos los cambios

git commit -am "Agregué información, cambié el código y puse todo el texto azul"

git merge second                            # Hacemos un merge estando en master y veremos el conflicto
```

#### Paso 4: Resolver el conflicto

Para solucionar el conflicto podemos:

1. Abrir el archivo con el editor de texto y modificar lo que nos esté señalando
2. Guardar los cambios
3. En VSC, podemos seleccionar el cambio entrante, el cambio actual, o ambos usando los botones que VSC proporciona

```bash
git status                                  # Ver el estado (archivos con conflictos)

git commit -am "Solución de conflictos al mergear las ramas"

git checkout second                         # Seguiremos con la versión anterior, porque el merge fue en master

git merge master                            # Ahora pasamos los cambios a la rama second
```

### Puntos clave para resolver conflictos

- Cuando Git muestra un conflicto, el archivo contiene marcadores especiales: `<<<<<<<`, `=======`, `>>>>>>>`
- `<<<<<<<` marca el inicio de tus cambios
- `=======` separa tus cambios de los cambios entrantes
- `>>>>>>>` marca el final de los cambios entrantes
- Debes eliminar estos marcadores y mantener el código que desees
- Siempre revisar el archivo después de resolver conflictos para asegurar que todo está correcto

### Tarea

Agregar esta clase al `README.md` en formato Markdown y hacer el commit correspondiente con el cambio.

