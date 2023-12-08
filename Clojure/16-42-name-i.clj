;Desafio: precisamos crior uma função que, dada um conjunto (vetor)
;de disciplinas e o semestre da discente, deve:

;-filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
;-transformar nome da disciplina para maiusculo e descartar demais informações
;-criar uma String concatenando o nome de todas as disciplinas filtradas

;Exemplo de entrada:
;[{:nome "Estrutura de dados" :semestre 2}
;              {:nome "Algoritmos" :semestre 1}
;              {:nome "Inteligencia Artificial" :semestre 3}] 2

;Exemplo de saida:
;"ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"

(defn disciplines [vector semestre]
  (clojure.string/join ", " (map clojure.string/upper-case (map :nome (filter #(>= (:semestre %) semestre) vector)))))

(defn disciplines-threading-last [vector semestre]
  (->> vector
       (filter #(>= (:semestre %) semestre))
       (map :nome)
       (map clojure.string/upper-case)
       (clojure.string/join ", ")))

(disciplines [{:nome "Estrutura de dados" :semestre 2}
              {:nome "Algoritmos" :semestre 1}
              {:nome "Inteligencia Artificial" :semestre 3}] 2)