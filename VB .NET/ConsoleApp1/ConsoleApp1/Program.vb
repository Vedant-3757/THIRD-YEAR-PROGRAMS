'Imports System

'Module Program
'    Sub Main()
'        Dim num As Integer = 40
'        If 40 > 0 Then
'            Console.WriteLine("40 is greter than 0 number")

'            If 40 > 50 Then
'                Console.WriteLine("40 is less than 50 number")
'            Else
'                Console.WriteLine("do no match condition")
'            End If
'        Else
'            Console.WriteLine("do not match the number")
'        End If



'    End Sub
'End Module
Imports System


Module Program
    Sub Main()
        Dim num As Integer

        Try
            Console.WriteLine("Enter a number:")
            num =
                Console.ReadLine()

            If num Mod 2 <> 0 Then
                Throw New Exception("Enter Even Number:")
            End If
            If num < 0 Then
                Throw New Exception("Cannot calaculate square root of a negetive number:")

            End If
            Dim result As Double = Math.Sqrt(num)
            Console.WriteLine("square root is:" & result)
        Catch ex As Exception
            Console.WriteLine("Square root is :" & ex.Message)

        Finally
            Console.WriteLine("Code excute successfull")

        End Try
        Console.ReadLine()
    End Sub
End Module