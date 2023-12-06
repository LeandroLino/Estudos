; Padrões de códigos da aula 5 da seção 1
;helloWorld == camel case --> usada em JS
;HelloWorld == pascal case  --> usada em Java
;Hello_world == snake case --> usanda em python
;Hello-world == kabab case --> usanda em clojure

;Funções
;Função curta pode ser em uma linha, exemplo:
(defn print-hello [] (println "Hello, World!"))
;mas também pode ser:
(defn print-hello [] (println "Hello, World!"))
;Não pode ser:
(defn print-hello 
  [] 
  (println "Hello, World!")
  )
;identação em clojure normalmente é 2 espaços, mas isso pode mudar

;Retornos de funções, toda função tem um retorno, normalmente a ultima expressão.
;no caso do println não retornada nada, fica:
(defn multiple-expressions [] 
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")) ; --> Retorna 'nil'

(defn multiple-expressions [] 
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (println "Hello, World!")
  (+ 1 1)) ; --> Retorna 2