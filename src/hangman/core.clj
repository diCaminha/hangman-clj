(ns hangman.core
  (:gen-class))

(defn loose-msg [] (print "you loose"))
(defn win-msg [] (print "you win"))

(def total-lifes 5)

(defn game [lifes words right-letters]
	(if (= lifes 0)
		(loose-message)
		(game (dec lifes)))
  
  
(defn -main
  "hangman game."
  [& args]
  (println "Hello, World!"))
