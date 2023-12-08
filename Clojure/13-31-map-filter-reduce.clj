;Filter, Map e Reduce

;Filter

(defn esta-no-quinto-ano?
  [ano]
  (= ano 5))

(defn quantidade-estudantes-no-quinto-ano 
  [estudantes]
  (count (filter #(= % 5) estudantes)))

(defn soma-de-idades 
  [idades]
  (reduce + idades))

(defn tamanho-medio [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(defn tamanho-medio [nomes]
  (/ (reduce + (map #(if (> (count %) 3) (count %) 0) nomes)) (count nomes)))

(defn tem-mais-que-tres-caracteres?
  [nome]
  (> (count nome) 3))

(defn tamanho-medio [nomes]
  (/ (reduce + (map #(if (> (count %) 3) (count %) 0) nomes)) (count (filter tem-mais-que-tres-caracteres? nomes))))