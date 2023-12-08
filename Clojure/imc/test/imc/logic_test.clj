(ns imc.logic-test
  (:require [clojure.test :refer :all]
            [imc.logic :refer :all]))

(deftest valor-imc-test
  (testing "Uma pessoa muito magra deve ter IMC baixo do peso"
    (is (= :peso-baixo (indicador-imc 1 2))))
  (testing "Uma pessoa com peso ideial deve ter IMC ideal"
    (is (= :peso-ideal (indicador-imc 70 1.70))))
  (testing "Uma pessoa acima do peso ideial deve ter IMC acima do peso"
    (is (= :peso-acima (indicador-imc 100 1.50)))))