const saveText = async () => {
  const text = "The text entered by the user"; // Get the actual text from your input field
  const response = await fetch('/api/save-text', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ text }),
  });

  if (response.ok) {
    // Handle success
    const result = await response.json();
    console.log(result); // You can display a success message to the user
  } else {
    // Handle error
    console.error('Failed to save text');
  }
};