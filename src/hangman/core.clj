(ns hangman.core
  (:gen-class))

(defn loose-msg [] (print "you loose"))
(defn win-msg [] (print "you win"))


(defn read-letter! [] (read-line))

(defn analyse-guess [guess lifes word right-letters]
  (if (contains? word guess)
    (game lifes word (conj right-letters guess)
    (game (dec lifes) word right-letters) )))

(def total-lifes 5)

(defn missing-letters [word right-letters]
  (remove (fn [letter] (contains? right-letters (str letter)) word)))

(defn completed-word? [word right-letters]
  (empty? (missing-letters word right-letters)))

(defn game [lifes word right-letters]
	(if (= lifes 0)
		(loose-msg)
    (if (completed-word? word right-letters)
      (win-msg)
      (analyse-guess (read-letter!) lifes word right-letters)
		
  
  
(defn -main
  "hangman game."
  [& args]
  (println "Hello, World!"))
