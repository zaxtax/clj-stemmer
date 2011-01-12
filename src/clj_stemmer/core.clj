(ns clj-stemmer.core
  (:import (org.tartarus.snowball.ext englishStemmer
				      danishStemmer
				      frenchStemmer
				      hungarianStemmer
				      norwegianStemmer
				      portugueseStemmer
				      russianStemmer
				      swedishStemmer
				      dutchStemmer
				      finnishStemmer
				      germanStemmer
				      italianStemmer
				      romanianStemmer
				      spanishStemmer
				      turkishStemmer
				      porterStemmer)))
(defn stem [word]
  (let [stemmer (doto (englishStemmer.)
		  (.setCurrent word)
		  .stem)]
    (.getCurrent stemmer)))
