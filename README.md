
# Ejemplo de Testing con Stubs y Mocks - Ruleta Virtual

[![Build Status](https://github.com/uqbar-project/eg-ruletas-kotlin/actions/workflows/gradle-build.yml/badge.svg?branch=master)](https://github.com/uqbar-project/eg-ruletas-kotlin/actions/workflows/gradle-build.yml) [![codecov](https://codecov.io/gh/uqbar-project/eg-ruletas-kotlin/branch/master/graph/badge.svg)](https://codecov.io/gh/uqbar-project/eg-ruletas-kotlin?branch=master)

> El build falla porque los tests no pueden controlar a una ruleta que devuelve números al azar (ver explicación más abajo)

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
- `stubbing-roulette-mockk`: el mismo _stub_ del branch 02 pero implementado con el framework Mockk. Tanto este branch como el anterior muestran tests de estado.
- `master`: usamos un _mock_ con Mockk que simula el envío de mails para mostrar cómo es un test de comportamiento.


## Material adicional

- [Video explicativo (todavía en Xtend)](https://www.youtube.com/watch?v=V5D43EcZkQ0)
- [Diapositivas](https://docs.google.com/presentation/d/1hyY1zyKUrs1qlrMuN_KuagVCmOzjv_XpPsXI7RLnSHk/edit#slide=id.p)
