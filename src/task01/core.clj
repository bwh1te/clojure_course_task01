(ns task01.core
  (:require [pl.danieljanus.tagsoup :refer :all])
  (:gen-class))


(defn get-links []
  (let [data (parse "clojure_google.html")]
    nil))

(defn -main []
  (println (str "Found " (count (get-links)) " links!")))


