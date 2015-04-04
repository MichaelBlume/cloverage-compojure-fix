# cloverage-compojure-fix

Lein coordinates: [cloverage-compojure-fix "0.1.0"]

Cloverage has a bug where it fails to instrument record instances in the AST

https://github.com/lshift/cloverage/issues/61

This isn't usually a problem, but Compojure happens to run into it as of 1.3.2

If you have a Compojure project, and you use Cloverage for coverage reports,
you can use this to make your builds work. Just require
cloverage-compojure-fix.core before your tests run


