(ns hangman.core
  (:gen-class))

 
(def total-lifes 5)

(defn game [lifes]
	(if (= lifes 0)
		(do
		(game (dec lifes)))
  
  
(defn -main
  "hangman game."
  [& args]
  (println "Hello, World!"))
