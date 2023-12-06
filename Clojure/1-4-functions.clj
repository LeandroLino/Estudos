; Funções
(defn print-hello-world [] (print "Hello World!"))
(defn print-hello [x] (print "Hello, " x "!"))
#(print "Hello, " % "!")
(defn print-hello
  ([x] (print "Hello, " x "!"))
  ([] (print-hello "World")))
(defn fine-value [value] 
  (* 0.1 value))
