Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub DateTimePicker1_ValueChanged(sender As Object, e As EventArgs) Handles DateTimePicker1.ValueChanged

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim selecteddate As Date = DateTimePicker1.Value
        Day.Text = selecteddate.Day
        Month.Text = selecteddate.Month
        Year.Text = selecteddate.Year
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles Year.TextChanged

    End Sub
End Class
