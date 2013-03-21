(ns task01.core
  (:require [pl.danieljanus.tagsoup :refer :all])
  (:gen-class))

(defn get-links []
  (let [data (parse "clojure_google.html")
        result-blocks #(= (:class (attributes %)) "r")
        get-url #(:href ((% 2) 1))]
    (map get-url
      (filter
        result-blocks
        (tree-seq #(keyword? (first %)) rest data)))))

(defn -main []
  (println (str "Found " (count (get-links)) " links!")))
