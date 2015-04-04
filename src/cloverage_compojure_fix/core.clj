(ns cloverage-compojure-fix.core
  (:import [clojure.lang IPersistentMap])
  (:require
    [clout.core :refer [map->CompiledRoute Route route-matches]]))

;; Totally hacky workaround for 
;; https://github.com/lshift/cloverage/pull/59
;;
;; =(

(try
  (require 'cloverage.coverage)
  (println "using super hacky Route extension")
  (extend-type IPersistentMap
    Route
    (route-matches [m request]
      (route-matches (map->CompiledRoute m) request)))
  (catch Exception _))
