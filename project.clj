(defproject euler004 "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.5.0"]]
                   :plugins [[lein-midje "3.0.0"]]}}
  :main euler004.core)
