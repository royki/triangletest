# Minimum/Maximum Triangle Paths

- Environment
  - Scala: `2.13.3`
  - Sbt: `1.3.13`
- Run
  - `sbt run`
- Test
  - `sbt test`

- To be continued
  - Using Libs like Akka Actor
  - Refactor code

- Preview of Run

```console
Triangle is:
7
6 3
3 8 5
11 2 10 9

Minimal path is: 18
```

- Preview of Test

```console
MinpathcalulationSuite:
- minimalpath of a triangle with 1 value 0 (167 milliseconds)
- minimalpath a triangle with 1 value nonzero (2 milliseconds)
- minimalpath of a triangle with big value (7 milliseconds)
- minimalpath of a triangle with 500 value (369 milliseconds)
- minimalpath of a pascal triangle (3 milliseconds)
Execution took 0.55s
5 tests, 5 passed
All tests in suprnation.triangletest.MinpathcalulationSuite passed

===============================================
Total duration: 0.55s
All 1 test suites passed.
===============================================
```
