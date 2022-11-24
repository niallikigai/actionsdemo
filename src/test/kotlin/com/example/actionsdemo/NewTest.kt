package com.example.actionsdemo

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NewTest {

    @Test
    fun `do nothing sample`() {
        Assertions.assertThat(1).isEqualTo(1)
    }

}