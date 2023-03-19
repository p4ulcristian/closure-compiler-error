(ns watch
  (:require
   [shadow.cljs.devtools.server :as server]
   [shadow.cljs.devtools.api    :as shadow]))





(defn watch
  [config]
  ;(shell "npx babel node_modules --out-dir node_modules")
  (server/stop!)
  (server/start!)
  (shadow/watch :frontend)
  (println "Started shadow watch"))

