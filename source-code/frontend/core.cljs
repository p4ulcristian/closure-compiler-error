(ns frontend.core
  (:require [reagent.dom :as rdom]
            [reagent.core :as reagent]
            ["@react-spring/web" :refer [useSpring]]))


(defn view []
  [:div "hello"])

(defn start! []
  (rdom/render
   [view]
   (.getElementById js/document "app")))

