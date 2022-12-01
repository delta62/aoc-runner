(defproject aoc-runner "0.1.0"
  :description "Command line runner for advent of code"
  :url "https://github.com/delta62/aoc-runner"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [clj-http "3.12.3"]
                 [clojure-term-colors "0.1.0"]
                 [org.clojure/tools.namespace "1.3.0"]
                 [org.clojure/java.classpath "1.0.0"]]
  :repl-options {:init-ns aoc-runner.core})
