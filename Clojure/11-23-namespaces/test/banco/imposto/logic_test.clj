(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer [imposto-retido-fonte]]))

;Solicitação do cliente
;Valores abaixo de mil reais não tem imposto retido na fonte.
;Acima disso pagam 10% de imposto


(deftest taxes-test
  (testing "Dado um valor abaixo de mil reais então não deve ter imposto retido"
    (is (= 0 (imposto-retido-fonte 0.1)))
    (is (= 0 (imposto-retido-fonte 999.99))))
  (testing "Dado um valor acima de mil reais então deve ter imposto retido em 10%"
    (is (= 100.0M (imposto-retido-fonte 1000)))
    (is (= 100.1M (imposto-retido-fonte 1001)))))
