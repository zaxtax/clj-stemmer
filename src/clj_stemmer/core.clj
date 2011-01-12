(ns clj-stemmer.core
  (:import (org.tartarus.snowball.ext englishStemmer
				      porterStemmer)))
(defn stem [word]
  (let [stemmer (doto (englishStemmer.)
		  (.setCurrent word)
		  .stem)]
    (.getCurrent stemmer)))
