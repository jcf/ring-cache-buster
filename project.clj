(defproject ring-cache-buster "0.2.0-SNAPSHOT"
  :description "Ring middleware that tells the world to cache nothing"
  :url "https://github.com/listora/ring-cache-buster"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.0-RC1"]]
  :deploy-repositories [["releases" :clojars]]
  :plugins [[codox "0.8.5"]]
  :codox {:project {:name "Ring-Cache-Buster"}}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})
