const stripe = Stripe('pk_test_51OEVBsHFoA6tn8NNfsSZ5N6R8ibUiGAajWFEFPWBhPWPCVimnaflWtgHw5UhcA0mqEskZbnESvv9Tb57ce6SBR7L00PxMIfzaM');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});