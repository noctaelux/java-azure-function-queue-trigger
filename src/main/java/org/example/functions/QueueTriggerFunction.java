package org.example.functions;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Storage Queue trigger.
 */
public class QueueTriggerFunction {
    /**
     * This function will be invoked when a new message is received at the specified path. The message contents are provided as input to this function.
     */
    @FunctionName("QueueTrigger-Java")
    public void run(
        @QueueTrigger(name = "message", queueName = "test-queue", connection = "AzureWebJobsStorage") Orden orden,
        final ExecutionContext context) {

        context.getLogger().info("RECUPERANDO: Orden "+orden.getNumero()+", con descripción "+orden.getDescripcion()+". ");
    }
}
