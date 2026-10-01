package com.example.urbanreport.domain

import com.example.urbanreport.domain.model.Report
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ReportTest {

    @Test
    @DisplayName("Dado un reporte nuevo, deberá arrojar una excepción si no tiene descripción")
    fun shouldNotCreateReportWithoutDescription() {
        assertThrows(IllegalArgumentException::class.java) {
            Report("1", "", 90.0, 160.0)
        }
    }

    @Test
    @DisplayName("Dado un reporte nuevo, si su latitud excede el límite debera arrojar una excepción")
    fun shouldNotCreateReportWithLatitudeOutOfBound(){
        assertThrows(IllegalArgumentException::class.java){
            Report("1", "Reporte", -100.0, 160.0)
        }
    }

    @Test
    @DisplayName("Dado un reporte nuevo, si su latitud excede el límite debera arrojar una excepción")
    fun shouldNotCreateReportWithLongitudeOutOfBound(){
        assertThrows(IllegalArgumentException::class.java){
            Report("1", "Reporte", 80.0, 190.0)
        }
    }
}
