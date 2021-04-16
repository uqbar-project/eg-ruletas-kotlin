
# Ejemplo de Testing con Stubs y Mocks - Ruleta Virtual

[![Build Status](https://travis-ci.com/uqbar-project/eg-ruletas-kotlin.svg?branch=master)](https://travis-ci.com/uqbar-project/eg-seguros-kotlin) [![codecov](https://codecov.io/gh/uqbar-project/eg-ruletas-kotlin/branch/master/graph/badge.svg?token=E86YSKSVYYW)](https://codecov.io/gh/uqbar-project/eg-ruletas-kotlin)

## Objetivo

Muestra cómo testear con mocks y stubs cuando tenemos valores aleatorios o tenemos que evitar que manden mails cada vez que ejecutamos los tests.

## Conceptos a ver

* Testeo unitario
* Generación de stubs
* Generación de tests de expectativa mediante el uso de mocks que provee [Mockk](https://mockk.io/)

## Branches

Cada branch tiene una introducción y una explicación detallada.

- `master`: los tests son _flaky_. Fallan (casi siempre) porque la ruleta devuelve números en forma aleatoria, y no es posible repetir las apuestas ganadoras.
- `stubbing-roulette`: arreglamos los _flaky tests_ implementando un _stub_ manual que permite configurar el número ganador de la ruleta virtual.
- `stubbing-roulette-mockk`: el mismo _stub_ del branch 02 pero implementado con el framework Mockito. Tanto este branch como el anterior muestran tests de estado.
- `mock-tests`: usamos un _mock_ con Mockito que simula el envío de mails para mostrar cómo es un test de comportamiento.


## Material adicional

- [Video explicativo (todavía en Xtend)](https://www.youtube.com/watch?v=V5D43EcZkQ0)
- [Diapositivas](https://docs.google.com/presentation/d/1hyY1zyKUrs1qlrMuN_KuagVCmOzjv_XpPsXI7RLnSHk/edit#slide=id.p)
