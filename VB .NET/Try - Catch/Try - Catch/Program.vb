Module program
    Sub main()

        Try
            Console.WriteLine("Enter num : ")
            Dim a As Integer = Console.ReadLine()
            If a >= 0 Then
                Console.WriteLine("The number is Positive")
            Else
                Console.WriteLine("The Number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine("Error : Value is not Numeric !!")
        Finally
            Console.WriteLine("Program Executed Successfully!!")
        End Try
    End Sub
End Module